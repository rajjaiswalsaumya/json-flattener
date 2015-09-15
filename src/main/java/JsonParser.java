import com.fasterxml.jackson.databind.ObjectMapper;
import models.JsonModel;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

/**
 * Created by grohit on 9/1/15.
 */
public class JsonParser {


    public List<JsonModel> getJsonModelFromFile(File f) throws IOException {
        ObjectMapper mapper = new ObjectMapper().setVisibility(FIELD, ANY);
        Iterator<JsonModel> thingsIterator = mapper.reader(JsonModel.class).readValues(f);
        List<JsonModel> list = new ArrayList<>();
        while (thingsIterator.hasNext()) {
            list.add(thingsIterator.next());
        }

        return list;
    }

    public List<JsonModel> getJsonModelFromFile(String filePath) {
        List<JsonModel> list = new ArrayList<>();
        try {
            list.addAll(getJsonModelFromFile(new File(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<JSONObject> getJsonObject(List<JsonModel> list) {
        List<JSONObject> jsonObjectList = new ArrayList<>(list.size());
        JSONObject temp = null;
        ObjectMapper mapper = new ObjectMapper();

        for (JsonModel m : list) {
            try {
                temp = new JSONObject(mapper.writeValueAsString(m));
                if (temp != null)
                    jsonObjectList.add(temp);
                temp = null;
            } catch (Exception e) {
            }
        }
        return jsonObjectList;
    }

    public JSONObject getJSONObject(String filePath) {
        File f = new File(filePath);
        JSONObject json = null;
        if (f.exists()) {
            InputStream is = null;
            try {
                is = new FileInputStream(f);
                String jsonTxt = IOUtils.toString(is);
                json = new JSONObject(jsonTxt);
                return json;
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
        return json;
    }


    private void writeData(File destinationFile, List<DataModel> data) {
        try {
            if (!destinationFile.getParentFile().exists())
                destinationFile.getParentFile().mkdirs();
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            for (DataModel s : data)
                writer.write(s.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private String getCSVFileName(String sourceFilePath) {
        return new String(Paths.get(sourceFilePath, ".csv").getFileName().toString());
    }

    public void createCSVString(File sourceFile, File destinationFile) {
        List<DataModel> dataModelList = createCSVString(sourceFile.getPath());
        writeData(destinationFile, dataModelList);
    }

    public List<DataModel> createCSVString(String sourceFilePath) {
        System.out.println("Creating csv string, from" + sourceFilePath);
        Set<String> headers = new HashSet<>();

        List<JSONObject> jsonObjects = getJsonObject(getJsonModelFromFile(sourceFilePath));
        headers.addAll(createHeaders(jsonObjects.get(0), null));
        List<DataModel> dataModelList = new ArrayList<>();

        String LINE_SEPARATOR = System.getProperty("line.separator");

        for (int i = 0; i < jsonObjects.size(); i++) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                for (String s : headers)
                    sb.append("\"").append(s).append("\"").append(",");
                sb.setLength(sb.length() - 1);
                dataModelList.add(new DataModel(sourceFilePath, true, sb.append(LINE_SEPARATOR).toString()));
            }

            StringBuilder sb = new StringBuilder();
            for (String s : headers)
                sb.append("\"").append(getValueRecursively(jsonObjects.get(i), s)).append("\"").append(",");
            sb.setLength(sb.length() - 1);
            dataModelList.add(new DataModel(sourceFilePath, false, sb.append(LINE_SEPARATOR).toString()));
        }

        return dataModelList;
    }

    public Set<String> createHeaders(JSONObject jsonObject, String parent) {
        Object o = null;
        Set<String> headers = new HashSet<>();
        Set<String> reIterableHeader = new HashSet<>();

        Set<String> jsonKeysSet = jsonObject.keySet();
        for (String s : jsonKeysSet) {
            if (jsonObject.isNull(s) || jsonObject.get(s) instanceof JSONString || jsonObject.get(s) instanceof java.lang.String || jsonObject.get(s) instanceof java.lang.Boolean || jsonObject.get(s) instanceof java.lang.Number) {
                headers.add(parent == null ? s : parent + "." + s);
            } else if (jsonObject.get(s) instanceof JSONArray)
                headers.addAll(createHeaders(jsonObject.getJSONArray(s), getAppendedfParentName(s, parent)));
            else {
                headers.addAll(createHeaders(jsonObject.getJSONObject(s), getAppendedfParentName(s, parent)));
            }
        }
        return headers;
    }


    public Set<String> createHeaders(JSONArray jsonArray, String parent) {
        Object o = null;
        Set<String> headers = new HashSet<>();
        Set<String> reIterableHeader = new HashSet<>();
        if (jsonArray.length() > 0) {
            for (int i = 0; i < jsonArray.length(); i++) {
                o = jsonArray.get(i);
                if (o instanceof JSONArray) {
                    JSONObject oo = (JSONObject) o;
                    headers.addAll(getAppendedfParentName(oo, parent));
                } else if (o instanceof JSONObject)
                    headers.addAll(createHeaders((JSONObject) o, parent));
                else
                    headers.add(parent);
            }
        } else {
            headers.add(parent);
        }
        return headers;
    }

    public String getAppendedfParentName(String child, String parent) {
        if (parent == null || parent.isEmpty())
            return child;
        return String.format("%s.%s", parent, child);
    }

    public Set<String> getAppendedfParentName(JSONObject o, String parent) {
        Set<String> keysSet = o.keySet();
        Set<String> modifiedHeaders = new HashSet<>();

        for (String key : keysSet) {
            if (key != null && !key.isEmpty()) {
                if (parent != null || !parent.isEmpty())
                    modifiedHeaders.add(String.format("%s.%s", parent, key));
                else
                    modifiedHeaders.add(key);
            }
        }

        return modifiedHeaders;
    }


    public Set<String> parseHeadersRecursively(JSONObject ob, Set<String> keys, String parent) {
        Set<String> headers = new HashSet<>();
        Iterator<String> iterator = ob.keys();
        while (iterator.hasNext()) {
            Object tObject = iterator.next();
            if (tObject instanceof JSONString) {
                if (parent == null)
                    headers.add(tObject.toString());
                else
                    headers.add(parent + "." + tObject.toString());
            } else if (tObject instanceof JSONArray) {
                if (parent == null)
                    headers.add(tObject.toString());
                else
                    headers.add(parent + "." + tObject.toString());
            } else if (tObject instanceof JSONObject) {
                parseHeadersRecursively((JSONObject) tObject, headers, null);
            }

        }
        return headers;
    }

    public Object getValueRecursively(JSONObject ob, String key) {
        Object o = null;
        int endIndex = -1;
        if ((endIndex = key.indexOf(".")) != -1) {
            int beginIndex = 0;
            o = ob.get(key.substring(beginIndex, endIndex));
            key = key.substring(endIndex + 1);

            if (o instanceof JSONArray)
                return getValueRecursively((JSONArray) o, key);
            else
                return getValueRecursively((JSONObject) o, key);

        } else
            return ob.get(key);
    }

    public Object getValueRecursively(JSONArray ob, String key) {
        Object x = null;
        for (int i = 0; i < ob.length(); i++) {
            x = ob.get(0);
            if (x instanceof JSONObject || x instanceof JSONArray) {
                if (x instanceof JSONObject) {
                    getValueRecursively((JSONObject) x, key);
                } else if (x instanceof JSONArray) {
                    getValueRecursively((JSONArray) x, key);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                for (int ii = 0; ii < ob.length(); ii++)
                    sb.append(ob.get(ii)).append("|");

                sb.setLength(sb.length() - 1);
                return sb.toString();
            }
        }
        return null;
    }


}
