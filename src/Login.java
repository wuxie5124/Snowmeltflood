import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login {
    public static final int ROWS = 8;
    public static final int COLUMNS = 20;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    JLabel jLabelTitle;
    JLabel jLabelID;
    JLabel jLabelPWD;
    JTextField jTextFieldID;
    JTextField jTextFieldPWD;
    JButton jButtonDL;
    JFrame jFrame;

    public Login() {
        jFrame = new JFrame("登录");

        jFrame.setSize(WIDTH, HEIGHT);
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints;

        jLabelTitle = new JLabel("登录系统");
        jLabelID = new JLabel("用户名:");
        jLabelPWD = new JLabel("密码:");
        jTextFieldID = new JTextField();
        jTextFieldPWD = new JTextField();
        jButtonDL = new JButton("登录");

        jPanel.add(jLabelTitle);
        gridBagConstraints = new GridBagConstraints(0, 0, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
        gridBagLayout.addLayoutComponent(jLabelTitle, gridBagConstraints);

        jPanel.add(jLabelID);
        gridBagConstraints = new GridBagConstraints(0, 1, 1, 1, 0, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 10, 0, 10), 0, 0);
        gridBagLayout.addLayoutComponent(jLabelID, gridBagConstraints);
        jPanel.add(jTextFieldID);
        gridBagConstraints = new GridBagConstraints(1, 1, 4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 30), 0, 0);
        gridBagLayout.addLayoutComponent(jTextFieldID, gridBagConstraints);

        jPanel.add(jLabelPWD);
        gridBagConstraints = new GridBagConstraints(0, 2, 1, 1, 0, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 10, 0, 10), 0, 0);
        gridBagLayout.addLayoutComponent(jLabelPWD, gridBagConstraints);
        jPanel.add(jTextFieldPWD);
        gridBagConstraints = new GridBagConstraints(1, 2, 4, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 30), 0, 0);
        gridBagLayout.addLayoutComponent(jTextFieldPWD, gridBagConstraints);

        jPanel.add(jButtonDL);
        gridBagConstraints = new GridBagConstraints(0, 3, 5, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
        gridBagLayout.addLayoutComponent(jButtonDL, gridBagConstraints);

        jButtonDL.addActionListener(actionListener1);

        jFrame.add(jPanel);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭，应用程序结束
        jFrame.setVisible(true);    //显示窗口


    }

    ActionListener actionListener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (jTextFieldID.getText() == null || jTextFieldID.getText().equals("")) {
                JOptionPane.showMessageDialog(jFrame, "用户名不能为空", "提示", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (jTextFieldID.getText().equals("zjm") || jTextFieldPWD.getText().equals("123")) {
                jFrame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(jFrame, "密码错误", "提示", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    };

    public static void main(String[] args) {
        new Login();
    }

}
