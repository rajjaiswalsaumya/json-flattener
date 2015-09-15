import models.JsonModel;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.flamingpenguin.jewel.cli.ArgumentValidationException;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;
import static uk.co.flamingpenguin.jewel.cli.CliFactory.parseArguments;

/**
 * Created by grohit on 9/1/15.
 */
public class Runner {

    //private static final String DEFAULT_INPUT_DIR = "/opt/json/raw";
    private static final String DEFAULT_INPUT_DIR = "C:\\opt\\json\\raw";
    private static final String DEFAULT_OUTPUT_DIR = "C:\\opt\\json\\flat";
    private static String INPUT_DIR = null;
    private static String OUTPUT_DIR = null;
    private static String PATTERN = null;
    private static Pattern pattern = null;
    private static Logger logger = LoggerFactory.getLogger(Runner.class);

    private static String getCommonValue(String path, String defaultPath) {
        if (path != null && !path.isEmpty()) {
            return path.trim();
        }
        return defaultPath;
    }

    private static void info(String key, String value) {
        System.out.println(String.format(" %s : %s ", key, value));
    }

    private static void display() {
        info("INPUT_DIR", INPUT_DIR);
        info("OUTPUT_DIR", OUTPUT_DIR);
        info("PATTERN", PATTERN);
    }

    public static void main(String[] args) {
        try {
            DirConf dConf = parseArguments(DirConf.class, args);
            INPUT_DIR = getCommonValue(dConf.getInputDirName(), DEFAULT_INPUT_DIR);
            OUTPUT_DIR = getCommonValue(dConf.getOutputDirName(), DEFAULT_OUTPUT_DIR);
            PATTERN = getCommonValue(dConf.getFilePattern(), null);
            if (PATTERN != null)
                pattern = compile(PATTERN);
            display();
            process();

        } catch (ArgumentValidationException e) {
            System.err.println(e.getMessage());
        }

    }

    private static void process() {
        File dir = new File(INPUT_DIR);
        System.out.println("Using dir :" + dir.getAbsolutePath());
        File[] files = null;
        FileFilter filter = new RegexFileFilter(PATTERN);
        files = dir.listFiles(filter);
        if (files != null && files.length > 0) {
            JsonParser parser = new JsonParser();
            List<JsonModel> l = new ArrayList<>();
            for (File f : files) {
                logger.info("Parsing : {}", f.getAbsolutePath());
                parser.createCSVString(f, new File(DEFAULT_OUTPUT_DIR, FilenameUtils.getBaseName(f.getName()) + ".csv"));
            }
        } else {
            System.out.println("No files found in dir :" + INPUT_DIR);
        }
    }


}
