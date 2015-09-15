import uk.co.flamingpenguin.jewel.cli.Option;

/**
 * Created by grohit on 9/1/15.
 */
public interface DirConf {
    @Option(shortName = "id", longName = "idir", defaultToNull = true)
    String getInputDirName();

    @Option(shortName = "od", longName = "odir", defaultToNull = true)
    String getOutputDirName();

    @Option(shortName = "p", longName = "pattern", defaultValue = "\\w*\\.json")
    String getFilePattern();
}