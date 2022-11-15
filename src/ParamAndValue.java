import java.util.ArrayList;

public class ParamAndValue {
    public String name;
    public ArrayList<String> value;

    public ParamAndValue(String name, ArrayList<String> value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }
}
