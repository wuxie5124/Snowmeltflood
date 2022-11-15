import java.util.HashMap;

public class GBDT extends MachineLearn {
    public GBDT() {
        type = "GBDT";
        Paramter = new HashMap<>();
        Paramter.put("n_estimators", "80");
        Paramter.put("max_depth", "3");
        Paramter.put("min_samples_split", "100");
        Paramter.put("min_samples_leaf", "20");
        Paramter.put("max_features", "sqrt");
        Paramter.put("subsample", "0.7");
        Paramter.put("learning_rate", "0.05");
        Paramter.put("random_state", "10");
    }

    public GBDT(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        type = "GBDT";
        Paramter = new HashMap<>();
        Paramter.put("n_estimators", str1);
        Paramter.put("max_depth", str2);
        Paramter.put("min_samples_split", str3);
        Paramter.put("min_samples_leaf", str4);
        Paramter.put("max_features", str5);
        Paramter.put("subsample", str6);
        Paramter.put("learning_rate", str7);
        Paramter.put("random_state", str8);
    }
}

