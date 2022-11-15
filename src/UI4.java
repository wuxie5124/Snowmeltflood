import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI4 extends UI00 {
    public ArrayList<Major.MLParam> mlParams;

    public UI4(JFrame jFrame, JPanel jPanel, ArrayList<Major.MLParam> mlParams) {
        super(jFrame, jPanel);
        this.mlParams = mlParams;
    }

    JButton jButton1;
    JButton jButton2;

    @Override
    public void createUI(ArrayList<UI1.ParamData> paramList) {
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        jButton1 = new JButton("训练模型");
        jButton2 = new JButton("输出结果");

        JTextField jTextField = new JTextField();
        jPanel.add(jButton1, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jButton2, new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jTextField, new myGridBagConstraints(1, 0, 1, 2, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jFrame.add(jPanel);
        initListener();
    }

    private void initListener() {
        jButton1.addActionListener(actionListener);
        jButton2.addActionListener(actionListener);
    }

    ActionListener actionListener = e -> {
        if (e.getSource() == jButton1) {
            for (Major.MLParam mlParam : this.mlParams) {
                System.out.println(mlParam.getParamVal().get(0).ParamName + ":" + mlParam.getParamVal().get(0).ParamValue);
            }

        } else if (e.getSource() == jButton2) {

        }
    };
}
