import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Major {
    public static int CLASSIFY = 0;
    public static int REGRESSION = 1;
    public int TYPE = CLASSIFY;

    public ArrayList<String> firstLevel = new ArrayList<>();

    public String secondLevel;

    ArrayList<UI1.ParamData> paramList = new ArrayList<>();

    public String[] feature;
    JFrame jFrame = new JFrame();
    JPanel jPanel = new JPanel();
    JMenuItem item0 = new JMenu("预测类型");
    JMenuItem item1 = new JMenuItem("方法构建");
    JMenuItem item2 = new JMenuItem("模型参数设置");
    JMenuItem item3 = new JMenuItem("特征设置");
    JMenuItem item4 = new JMenuItem("方法执行");
    JMenuItem item9 = new JMenuItem("回归");
    JMenuItem item10 = new JMenuItem("分类");

    public ArrayList<MLParam> mlParams = new ArrayList<>();

    public Major() {
        JMenuBar menuBar = new JMenuBar();//创建菜单栏对象
        JMenu menu1 = new JMenu("融雪洪灾点预测");// 创建菜单对象
        menuBar.add(menu1);
        item0.add(item9);
        item0.add(item10);
        menu1.add(item0);
        menu1.addSeparator();//在菜单项中间添加分界线
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        item1.addActionListener(MenuItemAction);
        item2.addActionListener(MenuItemAction);
        item3.addActionListener(MenuItemAction);
        item4.addActionListener(MenuItemAction);
        item9.addActionListener(TypeSelectAction);
        item10.addActionListener(TypeSelectAction);

        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));//添加热键

        jFrame.setJMenuBar(menuBar);
        jFrame.setSize(600, 500);
        jFrame.setTitle("基于STACKING模型融雪洪灾预测模型");
        jFrame.setVisible(true);
    }


    ActionListener MenuItemAction = e -> {
        if (((JMenuItem) e.getSource()) == item1) {
            jPanel.removeAll();
            UI1 ui1 = new UI1(jFrame, jPanel);
            ui1.createUI(paramList);
        } else if (((JMenuItem) e.getSource()) == item2) {
            jPanel.removeAll();
            UI2 ui2 = new UI2(jFrame, jPanel, mlParams);
            ui2.createUI(paramList);
        } else if (((JMenuItem) e.getSource()) == item3) {
            jPanel.removeAll();
            UI3 ui3 = new UI3(jFrame, jPanel);
            ui3.createUI(null);
        } else if (((JMenuItem) e.getSource()) == item4) {
            jPanel.removeAll();
            UI4 ui4 = new UI4(jFrame, jPanel, mlParams);
            ui4.createUI(null);
        }
        jFrame.revalidate();
        jFrame.repaint();
    };
    ActionListener TypeSelectAction = e -> {
        if (e.getSource() == item9) {
            TYPE = Major.CLASSIFY;
        } else if (e.getSource() == item10) {
            TYPE = Major.REGRESSION;
        }
    };

    public static class MLParam {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<UI2.ParamData> getParamVal() {
            return paramVal;
        }

        public void setParamVal(ArrayList<UI2.ParamData> paramVal) {
            this.paramVal = paramVal;
        }

        String name;
        ArrayList<UI2.ParamData> paramVal;

        public MLParam(String name, ArrayList<UI2.ParamData> paramVal) {
            this.name = name;
            this.paramVal = paramVal;
        }
    }


}
