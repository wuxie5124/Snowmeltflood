import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class UI {
    public void UIcreate(JFrame jFrame,
                         JPanel jPanel, JPanel jPanel1, JPanel jPanel2, JButton jButton,
                         JLabel jLabel1, JLabel jLabel2, ArrayList<JLabel> jLabels1, ArrayList<JComboBox> jComboBoxes, JLabel jLabel3, JComboBox jComboBox2) {
        GridBagLayout gridBagLayout = new GridBagLayout();

        jPanel.setLayout(gridBagLayout);
        jPanel.add(jPanel1, new myGridBagConstraints(0, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        jPanel.add(jPanel2, new myGridBagConstraints(1, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        jPanel.add(jButton, new myGridBagConstraints(0, 3, 2, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.setPreferredSize(new Dimension(280, 280));
        jPanel2.setPreferredSize(new Dimension(280, 280));

        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        jPanel1.setLayout(gridBagLayout);
        jPanel1.add(jLabel1, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        JPanel jPanel11 = new JPanel();
        jPanel11.setLayout(gridBagLayout);
//        jPanel11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jPanel11.setPreferredSize(new Dimension(280, 260));

        jPanel11.add(jLabels1.get(0), new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel11.add(jComboBoxes.get(0), new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        jPanel11.add(jLabels1.get(1), new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel11.add(jComboBoxes.get(1), new myGridBagConstraints(1, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        jPanel11.add(jLabels1.get(2), new myGridBagConstraints(0, 2, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel11.add(jComboBoxes.get(2), new myGridBagConstraints(1, 2, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        jPanel11.add(jLabels1.get(3), new myGridBagConstraints(0, 3, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel11.add(jComboBoxes.get(3), new myGridBagConstraints(1, 3, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        jPanel1.add(jPanel11, new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));

        jPanel2.setLayout(gridBagLayout);
        jPanel2.add(jLabel2, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        JPanel jPanel22 = new JPanel();
        jPanel22.setLayout(gridBagLayout);
        jPanel22.setPreferredSize(new Dimension(280, 260));
        jPanel22.add(jLabel3, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel22.add(jComboBox2, new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jPanel22, new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));

        jFrame.add(jPanel);
    }

    public void UIcreate1(JFrame jFrame) {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();

        JButton jButton = new JButton("确定");
        jPanel.add(jPanel1, new myGridBagConstraints(0, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        jPanel.add(jPanel2, new myGridBagConstraints(1, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        jPanel.add(jButton, new myGridBagConstraints(0, 3, 2, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.setLayout(gridBagLayout);
        jPanel2.setLayout(gridBagLayout);
        jPanel1.setPreferredSize(new Dimension(280, 350));
        jPanel2.setPreferredSize(new Dimension(280, 350));
        jPanel1.setBorder(BorderFactory.createTitledBorder("方法"));
        jPanel2.setBorder(BorderFactory.createTitledBorder("参数"));
        JRadioButton jRadioButton1 = new JRadioButton("第一层方法1");
        JRadioButton jRadioButton2 = new JRadioButton("第一层方法2");
        JRadioButton jRadioButton3 = new JRadioButton("第一层方法3");
        JRadioButton jRadioButton4 = new JRadioButton("第一层方法4");
        JRadioButton jRadioButton5 = new JRadioButton("第二层方法1");
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
        group.add(jRadioButton4);
        group.add(jRadioButton5);

        jPanel1.add(jRadioButton1, new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.add(jRadioButton2, new myGridBagConstraints(0, 2, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.add(jRadioButton3, new myGridBagConstraints(0, 3, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.add(jRadioButton4, new myGridBagConstraints(0, 4, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel1.add(jRadioButton5, new myGridBagConstraints(0, 5, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
//        jPanel2.add(new JRadioButton("参数"), new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        int number = 6;
        JLabel[] jLabels = new JLabel[number];
        JSpinner[] jSpinners = new JSpinner[number];
        SpinnerModel[] spinnerModels = new SpinnerModel[number];
        ArrayList<String> list = new ArrayList<>();
        list.add("default");
        list.add("2");
        list.add("3");


        for (int i = 0; i < number; i++) {
            jLabels[i] = new JLabel("参数" + (i + 1));
            spinnerModels[i] = new SpinnerListModel(list);
            jSpinners[i] = new JSpinner(spinnerModels[i]);
        }
        jPanel2.add(jLabels[0], new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[0], new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jPanel2.add(jLabels[1], new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[1], new myGridBagConstraints(1, 1, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jPanel2.add(jLabels[2], new myGridBagConstraints(0, 2, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[2], new myGridBagConstraints(1, 2, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jPanel2.add(jLabels[3], new myGridBagConstraints(0, 3, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[3], new myGridBagConstraints(1, 3, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jPanel2.add(jLabels[4], new myGridBagConstraints(0, 4, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[4], new myGridBagConstraints(1, 4, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jPanel2.add(jLabels[5], new myGridBagConstraints(0, 5, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jSpinners[5], new myGridBagConstraints(1, 5, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.CENTER));

        jFrame.add(jPanel);

    }

    public void UIcreate2(JFrame jFrame) {
        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        JButton jButtonleft = new JButton("<<");
        JButton jButtonright = new JButton(">>");
        JButton jButtonread = new JButton("读取");
        JButton jButtonok = new JButton("确定");
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        jPanel1.setLayout(gridBagLayout);
        jPanel2.setLayout(gridBagLayout);
        jPanel3.setLayout(gridBagLayout);

        String[][] data = new String[][]{
                {"aaa"}, {"bbb"}, {"ccc"}
        };
        String[] name = new String[]{"name"};
        DefaultTableModel dtm = new DefaultTableModel(data, name) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        DefaultTableModel dtm2 = new DefaultTableModel(data, name) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable jTable1 = new JTable(dtm);
        JTable jTable2 = new JTable(dtm2);

        jPanel.add(jPanel1, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jPanel2, new myGridBagConstraints(0, 1, 1, 3, 1, 3).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jPanel3, new myGridBagConstraints(0, 4, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));


        jPanel2.add(jTable1, new myGridBagConstraints(0, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jPanel2.add(jButtonleft, new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.SOUTH));
        jPanel2.add(jButtonright, new myGridBagConstraints(1, 1, 1, 1, 1, 1).setFill(GridBagConstraints.HORIZONTAL).setAnchor(GridBagConstraints.NORTH));
        jPanel2.add(jTable2, new myGridBagConstraints(2, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jPanel3.add(jButtonread, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel3.add(jButtonok, new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jFrame.add(jPanel);
    }

    public void UIcreate3(JFrame jFrame){
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        JButton jButton1= new JButton("训练模型");
        JButton jButton2 = new JButton("输出结果");

        JTextField jTextField = new JTextField();
        jPanel.add(jButton1,new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jButton2,new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanel.add(jTextField,new myGridBagConstraints(1, 0, 1, 2, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        jFrame.add(jPanel);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 500);
        jFrame.setTitle("title");
        JMenuBar menuBar = new JMenuBar();//创建菜单栏对象
        jFrame.setJMenuBar(menuBar);

        JMenu menu1 = new JMenu("融雪洪灾点预测");// 创建菜单对象
        menuBar.add(menu1);

        JMenuItem item0 = new JMenu("预测类型");

        item0.add(new JMenuItem("回归"));
        item0.add(new JMenuItem("分类"));
//
        menu1.add(item0);



        JMenuItem item1 = new JMenuItem("方法构建");
        menu1.add(item1);

//        menu1.add(submenu);
//        submenu.add(new JMenuItem("子菜单1"));
//        submenu.add(new JMenuItem("子菜单2"));

        JMenuItem item2 = new JMenuItem("模型参数设置");
        menu1.add(item2);

        menu1.addSeparator();//在菜单项中间添加分界线

        JMenuItem item3 = new JMenuItem("特征设置");
        menu1.add(item3);

        JMenuItem item4 = new JMenuItem("方法执行");
        menu1.add(item4);

        menu1.addSeparator();//在菜单项中间添加分界线

        JMenu menu2 = new JMenu("区域降水预测");
        menuBar.add(menu2);

        JMenuItem item50 = new JMenu("预测类型");
        menu2.add(item50);

        item50.add(new JMenuItem("回归"));
        item50.add(new JMenuItem("分类"));


        JMenuItem item5 = new JMenuItem("方法构建");
        menu2.add(item5);

        JMenuItem item6 = new JMenuItem("模型参数设置");
        menu2.add(item6);

        menu2.addSeparator();//在菜单项中间添加分界线

        JMenuItem item7 = new JMenuItem("特征设置");
        menu2.add(item7);

        JMenuItem item8 = new JMenuItem("方法执行");
        menu2.add(item8);
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));//添加热键

        JPanel jPanel = new JPanel();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JButton jButton = new JButton("确定");
        JLabel jLabel1 = new JLabel("第一层方法设置");
        JLabel jLabel2 = new JLabel("第二层方法设置");
        ArrayList<JLabel> jLabels1 = new ArrayList<>();
        ArrayList<JComboBox> jComboBoxes = new ArrayList<>();
        JLabel jLabel3 = new JLabel("方法1");
        JComboBox jComboBox;
        for (int i = 0; i < 4; i++) {
            jLabels1.add(new JLabel("方法" + (i + 1)));
            jComboBox = new JComboBox<>();
            jComboBox.addItem("RandomForest");
            jComboBox.addItem("GBDT");
            jComboBox.addItem("XGBoost");
            jComboBox.addItem("LM");
            jComboBoxes.add(jComboBox);
        }
        JComboBox jComboBox2 = new JComboBox<>();
        jComboBox2.addItem("RandomForest");
        jComboBox2.addItem("GBDT");
        jComboBox2.addItem("XGBoost");
        jComboBox2.addItem("LM");
//        for (int i = 0 ,i <)

        UI ui = new UI();
        ui.UIcreate(jFrame, jPanel, jPanel1, jPanel2, jButton, jLabel1, jLabel2, jLabels1, jComboBoxes, jLabel3, jComboBox2);
//        ui.UIcreate1(jFrame);
//        ui.UIcreate2(jFrame);
//        ui.UIcreate3(jFrame);

        jFrame.setVisible(true);    //显示窗口
    }
}
