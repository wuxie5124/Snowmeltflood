import java.util.HashMap;

public class XGBoost extends MachineLearn{
    public XGBoost() {
        type ="XGBoost";
        Paramter = new HashMap<>();
        Paramter.put("learning_rate","0.1");
        Paramter.put("n_estimators","150");
        Paramter.put("max_depth","4");
        Paramter.put("min_child_weight","3");
        Paramter.put("seed","0");
        Paramter.put("subsample","0.9");
        Paramter.put("colsample_bytree","0.8");
        Paramter.put("gamma","0.1");
        Paramter.put("reg_alpha","0.05");
        Paramter.put("reg_lambda","0.1");
    }
    public XGBoost(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8,String str9,String str10) {
        type ="XGBoost";
        Paramter = new HashMap<>();
        Paramter.put("learning_rate",str1);
        Paramter.put("n_estimators",str2);
        Paramter.put("max_depth",str3);
        Paramter.put("min_child_weight",str4);
        Paramter.put("seed",str5);
        Paramter.put("subsample",str6);
        Paramter.put("colsample_bytree",str7);
        Paramter.put("gamma",str8);
        Paramter.put("reg_alpha",str9);
        Paramter.put("reg_lambda",str10);
    }
}
