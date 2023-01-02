import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;

public class UI3 extends UI0 {
    //第三页
    public UI3(JFrame jFrame, JPanel jPanel) {
        super(jFrame, jPanel);
    }
    JPanel jPanelSub;

    JButton jButtonRead;
    JButton jButtonOK;

    @Override
    public void createUI(ArrayList<UI1.ParamData> paramList) {
        jButtonRead = new JButton("读取");
        jButtonOK = new JButton("确定");
        jPanelSub = new JPanel();

        JTable paramTable = new JTable();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        jPanelSub.setLayout(gridBagLayout);

        String[] param = new String[]{"XJAVHRR_av", "Vegetation", "Variance_c", "Slope", "SD", "Road_densi", "Relative_E", "Particle_s", "Elevation", "Distance_f", "Curve_numb", "Agricultur"};
        ArrayList<ParamData> paramData = new ArrayList<>();
        for (int i = 0; i < param.length; i++) {
            paramData.add(new ParamData(ParamTableModel.CHOOSE, param[i]));
        }
        ParamTableModel paramTableModel = new ParamTableModel(paramData);
        paramTable.setModel(paramTableModel);
        paramTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        paramTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        paramTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(paramTable);
        jScrollPane.setPreferredSize(new Dimension(300, 300));
        paramTable.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            JCheckBox jCheckBox = new JCheckBox();
            private boolean ischecked;

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                ischecked = (Boolean) value;
                jCheckBox.setSelected(ischecked);
                return jCheckBox;
            }

            @Override
            public Object getCellEditorValue() {
                return jCheckBox.isSelected();
            }

            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return true;
            }

        });
        DefaultTableCellRenderer defaultTableCellRenderer = new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox jCheckBox = new JCheckBox();
                jCheckBox.setSelected((Boolean) value);
                int height=table.getRowHeight();
                this.setHorizontalAlignment(CENTER);
                table.setRowHeight(row,height*2);
                return jCheckBox;
            }
        };
        paramTable.getColumnModel().getColumn(2).setCellRenderer(defaultTableCellRenderer);
        DefaultTableCellRenderer defaultTableCellRenderer1 = new DefaultTableCellRenderer();
        defaultTableCellRenderer1.setHorizontalAlignment(0);
        paramTable.getColumnModel().getColumn(1).setCellRenderer(defaultTableCellRenderer1);
        paramTable.getColumnModel().getColumn(0).setCellRenderer(defaultTableCellRenderer1);

        jPanel.add(jScrollPane, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER).setInset(10,20,0,20));
        jPanel.add(jPanelSub, new myGridBagConstraints(0, 4, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER).setInset(10,20,20,20));
        jPanelSub.add(jButtonRead, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jPanelSub.add(jButtonOK, new myGridBagConstraints(1, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        jFrame.add(jPanel);

        initActionListener();
    }

    private void initActionListener() {
        jButtonRead.addActionListener(actionListenerPage3);
        jButtonOK.addActionListener(actionListenerPage3);
    }

    private class ParamData {
        public Boolean getCheck() {
            return isCheck;
        }

        public void setCheck(Boolean check) {
            isCheck = check;
        }

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        Boolean isCheck;
        String paramName;

        public ParamData(Boolean isCheck, String paramName) {
            this.isCheck = isCheck;
            this.paramName = paramName;
        }

    }

    private class ParamTableModel extends DefaultTableModel {

        private String[] colunmHeaders = new String[]{"序号", "参数名", "选择"};

        public static final boolean CHOOSE = true;

        public static final boolean UNCHOOSE = false;

        private ArrayList<ParamData> paramDatas = new ArrayList<>();

        public ParamTableModel(ArrayList<ParamData> paramDatas) {
            this.paramDatas = paramDatas;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 2;
        }

        @Override
        public int getRowCount() {
            return paramDatas == null ? 0 : paramDatas.size();
        }

        @Override
        public int getColumnCount() {
            return colunmHeaders.length;
        }

        @Override
        public String getColumnName(int column) {
            return colunmHeaders[column];
        }

        @Override
        public void setValueAt(Object aValue, int row, int column) {
            switch (column) {
                case 1:
                    paramDatas.get(row).setParamName((String) aValue);
                    break;
                case 2:
                    paramDatas.get(row).setCheck((Boolean) aValue);
                    break;
                default:
                    super.setValueAt(aValue, row, column);
            }
            this.fireTableCellUpdated(row, column);
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return rowIndex + 1;
                case 1:
                    return paramDatas.get(rowIndex).getParamName();
                case 2:
                    return paramDatas.get(rowIndex).getCheck();
                default:
                    return super.getValueAt(rowIndex, columnIndex);
            }
        }
    }

    ActionListener actionListenerPage3 = e -> {
        if (e.getSource() == jButtonRead) {


        } else if (e.getSource() == jButtonOK) {


        }
    };
}
