import java.util.ArrayList;

public class ParamAndValue {
    public String paramName;
    public ArrayList<String> paramValue;

    public ParamAndValue(String paramName, ArrayList<String> paramValue) {
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ArrayList<String> getParamValue() {
        return paramValue;
    }

    public void setParamValue(ArrayList<String> paramValue) {
        this.paramValue = paramValue;
    }
}
