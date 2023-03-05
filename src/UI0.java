import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class UI0 {
    JFrame jFrame;
    JPanel jPanel;
    private int TYPE;
    public HashMap<String, MLAndParam> paramHashMaps;


    public UI0(JFrame jFrame, JPanel jPanel) {
        this.jFrame = jFrame;
        this.jPanel = jPanel;
//        this.paramList = new ArrayList<>();
        initMLParamValue();
    }

    public int getTYPE() {
        return TYPE;
    }

    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }


    private void initMLParamValue() {
        MLAndParam XGBoost = new MLAndParam("XGBoost");
        MLAndParam GBDT = new MLAndParam("GBDT");
        MLAndParam RandomForest = new MLAndParam("RandomForest");
        MLAndParam KNN = new MLAndParam("KNeighbors");
        MLAndParam SVM = new MLAndParam("SupportVector");
        String[] RandomForestParam = new String[]{"n_estimators", "min_samples_split", "min_samples_leaf", "max_depth", "max_features", "random_state"};
        String[] GBDTParam = new String[]{"n_estimators", "min_samples_split", "min_samples_leaf", "max_features", "subsample", "learning_rate", "random_state"};
        String[] KNNParam = new String[]{"n_neighbors", "weights"};
        String[] XGBoostParam = new String[]{"learning_rate", "n_estimators", "max_depth", "min_child_weight", "subsample", "colsample_bytree", "reg_alpha", "reg_lambda"};
        String[] SVMParam = new String[]{"C", "kernel"};

        String[] n_estimators = new String[]{"Default", "50", "100", "200", "500", "1000"};
        String[] min_samples_split = new String[]{"Default", "2", "5", "10", "20", "50", "100"};
        String[] min_samples_leaf = new String[]{"Default", "1", "5", "10", "20", "50", "100"};
        String[] max_depth = new String[]{"Default", "10", "20", "30", "50", "70", "80", "100"};
        String[] max_features = new String[]{"Default", "sqrt", "log2", "1", "3", "5", "7", "9", "11"};
        String[] random_state = new String[]{"Default", "1", "3", "5"};
        String[] subsample = new String[]{"Default", "0.1", "0.2", "0.4", "0.5", "0.7", "0.8"};
        String[] learning_rate = new String[]{"Default", "0.1", "0.2", "0.3", "0.5", "0.7", "0.9", "1"};
        String[] n_neighbors = new String[]{"Default", "1", "3", "5", "7", "10"};
        String[] weights = new String[]{"uniform", "distance"};
        String[] min_child_weight = new String[]{"Default", "1", "2", "3", "4", "5", "6"};
        String[] colsample_bytree = new String[]{"Default", "0.2", "0.4", "0.6", "0.7", "0.8", "0.9", "1"};
        String[] reg_alpha = new String[]{"Default", "0.1", "0.2", "0.3", "0.4"};
        String[] reg_lambda = new String[]{"Default", "1", "2", "4", "5", "7", "9"};
        String[] C = new String[]{"Default", "0.1", "0.5", "10"};
        String[] kernel = new String[]{"rbf", "linear", "poly", "sigmoid", "precomputed"};

        ParamAndValue paramAndValue_n_estimators = new ParamAndValue("n_estimators", new ArrayList<>(Arrays.asList(n_estimators)));
        ParamAndValue paramAndValue_min_samples_split = new ParamAndValue("min_samples_split", new ArrayList<>(Arrays.asList(min_samples_split)));
        ParamAndValue paramAndValue_min_samples_leaf = new ParamAndValue("min_samples_leaf", new ArrayList<>(Arrays.asList(min_samples_leaf)));
        ParamAndValue paramAndValue_max_depth = new ParamAndValue("max_depth", new ArrayList<>(Arrays.asList(max_depth)));
        ParamAndValue paramAndValue_max_features = new ParamAndValue("max_features", new ArrayList<>(Arrays.asList(max_features)));
        ParamAndValue paramAndValue_random_state = new ParamAndValue("random_state", new ArrayList<>(Arrays.asList(random_state)));
        ParamAndValue paramAndValue_subsample = new ParamAndValue("subsample", new ArrayList<>(Arrays.asList(subsample)));
        ParamAndValue paramAndValue_learning_rate = new ParamAndValue("learning_rate", new ArrayList<>(Arrays.asList(learning_rate)));
        ParamAndValue paramAndValue_n_neighbors = new ParamAndValue("n_neighbors", new ArrayList<>(Arrays.asList(n_neighbors)));
        ParamAndValue paramAndValue_weights = new ParamAndValue("weights", new ArrayList<>(Arrays.asList(weights)));
        ParamAndValue paramAndValue_min_child_weight = new ParamAndValue("min_child_weight", new ArrayList<>(Arrays.asList(min_child_weight)));
        ParamAndValue paramAndValue_colsample_bytree = new ParamAndValue("colsample_bytree", new ArrayList<>(Arrays.asList(colsample_bytree)));
        ParamAndValue paramAndValue_reg_alpha = new ParamAndValue("reg_alpha", new ArrayList<>(Arrays.asList(reg_alpha)));
        ParamAndValue paramAndValue_reg_lambda = new ParamAndValue("reg_lambda", new ArrayList<>(Arrays.asList(reg_lambda)));
        ParamAndValue paramAndValue_C = new ParamAndValue("C", new ArrayList<>(Arrays.asList(C)));
        ParamAndValue paramAndValue_kernel = new ParamAndValue("kernel", new ArrayList<>(Arrays.asList(kernel)));


        RandomForest.addParam(paramAndValue_n_estimators);
        RandomForest.addParam(paramAndValue_min_samples_split);
        RandomForest.addParam(paramAndValue_min_samples_leaf);
        RandomForest.addParam(paramAndValue_max_depth);
        RandomForest.addParam(paramAndValue_max_features);
        RandomForest.addParam(paramAndValue_random_state);


        GBDT.addParam(paramAndValue_n_estimators);
        GBDT.addParam(paramAndValue_min_samples_split);
        GBDT.addParam(paramAndValue_min_samples_leaf);
        GBDT.addParam(paramAndValue_max_features);
        GBDT.addParam(paramAndValue_subsample);
        GBDT.addParam(paramAndValue_learning_rate);
        GBDT.addParam(paramAndValue_random_state);

        KNN.addParam(paramAndValue_n_neighbors);
        KNN.addParam(paramAndValue_weights);

        XGBoost.addParam(paramAndValue_learning_rate);
        XGBoost.addParam(paramAndValue_n_estimators);
        XGBoost.addParam(paramAndValue_max_depth);
        XGBoost.addParam(paramAndValue_min_child_weight);
        XGBoost.addParam(paramAndValue_subsample);
        XGBoost.addParam(paramAndValue_colsample_bytree);
        XGBoost.addParam(paramAndValue_reg_alpha);
        XGBoost.addParam(paramAndValue_reg_lambda);

        SVM.addParam(paramAndValue_C);
        SVM.addParam(paramAndValue_kernel);
        this.paramHashMaps = new HashMap<>();
        this.paramHashMaps.put("RandomForest", RandomForest);
        this.paramHashMaps.put("GBDT", GBDT);
        this.paramHashMaps.put("KNN", KNN);
        this.paramHashMaps.put("XGBoost", XGBoost);
        this.paramHashMaps.put("SVM", SVM);
    }

    public abstract void createUI(ArrayList<UI1.ParamData> paramList);
}
