/**
 * Created by grohit on 9/11/15.
 */
public class DataModel {
    String filePath;
    boolean hasHeaders;
    String data;

    public DataModel(String filePath, boolean hasHeaders, String data) {
        this.filePath = filePath;
        this.hasHeaders = hasHeaders;
        this.data = data;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isHasHeaders() {
        return hasHeaders;
    }

    public void setHasHeaders(boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
