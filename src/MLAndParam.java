import java.util.ArrayList;

public class MLAndParam {
    public String MLname;
    public ArrayList<ParamAndValue> Param;

    public MLAndParam(String MLname, ArrayList<ParamAndValue> param) {
        this.MLname = MLname;
        Param = param;
    }

    public MLAndParam(String MLname) {
        this.MLname = MLname;
        Param = new ArrayList<>();
    }

    public String getMLname() {
        return MLname;
    }

    public void setMLname(String MLname) {
        this.MLname = MLname;
    }

    public ArrayList<ParamAndValue> getParam() {
        return Param;
    }

    public void setParam(ArrayList<ParamAndValue> param) {
        Param = param;
    }

    public void addParam(ParamAndValue paramAndValue) {
        Param.add(paramAndValue);
    }

    public ParamAndValue getParamByName(String paramName) {
        for (ParamAndValue paramAndValue : Param) {
            if (paramAndValue.getParamName() == paramName) {
                return paramAndValue;
            }
        }
        return null;
    }
}
