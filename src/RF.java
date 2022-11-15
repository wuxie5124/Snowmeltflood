import java.util.HashMap;

public class RF extends MachineLearn{
    public RF() {
        type = "xgboost";
        Paramter = new HashMap<>();
        Paramter.put("n_estimators","10");
        Paramter.put("min_samples_split","100");
        Paramter.put("min_samples_leaf","10");
        Paramter.put("max_depth","1");
        Paramter.put("max_features","sqrt");
        Paramter.put("random_state","0");
    }
    public RF(String str1, String str2, String str3, String str4, String str5, String str6){
        Paramter = new HashMap<>();
        Paramter.put("n_estimators",str1);
        Paramter.put("min_samples_split",str2);
        Paramter.put("min_samples_leaf",str3);
        Paramter.put("max_depth",str4);
        Paramter.put("max_features",str5);
        Paramter.put("random_state",str6);
    }
}
