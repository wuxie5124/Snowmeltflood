import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;

public class UI1 extends UI00 {
    public UI1(JFrame jFrame, JPanel jPanel) {
        super(jFrame, jPanel);
    }

    JPanel jPanel1;
    JPanel jPanel2;
    JButton jButton;


    @Override
    public void createUI(ArrayList<ParamData> paramList) {
        int i = 0;
        if (paramList.size() == 0) {
            for (String name : paramHashMaps.keySet()) {
                paramList.add(new ParamData(i + 1, name, true));
                i++;
            }
            paramList.add(new ParamData(1, paramHashMaps.get("XGBoost").getMLname(), false));
        }
        this.jPanel.setLayout(new GridBagLayout());
//        this.jButton = new JButton("确定");
        JTable table = new JTable();
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setPreferredSize(new Dimension(300, 300));
        ParamTableModel paramTableModel = new ParamTableModel(paramList);
        table.setModel(paramTableModel);
        jScrollPane.setViewportView(table);
        table.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                String va = String.valueOf(value);
                if (paramList.get(row).getFirstLevel()) {
                    va = "第一层方法" + va;
                } else {
                    va = "第二层方法" + va;
                }
                int height = table.getRowHeight();
                this.setHorizontalAlignment(CENTER);
                table.setRowHeight(row, height * 3);
                return super.getTableCellRendererComponent(table, va, isSelected, hasFocus, row, column);
            }
        });

        table.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            JComboBox jComboBox;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                jComboBox = new JComboBox();
                for (String name : paramHashMaps.keySet()) {
                    jComboBox.addItem(name);
                }

                jComboBox.setSelectedItem((String) value);
                return jComboBox;
            }
        });
        table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JComboBox()) {
            JComboBox jComboBox;

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                jComboBox = new JComboBox();
                for (String name : paramHashMaps.keySet()) {
                    jComboBox.addItem(name);
                }

                jComboBox.setSelectedItem((String) value);
                return jComboBox;
            }

            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return true;
            }

            @Override
            public Object getCellEditorValue() {
                return jComboBox.getSelectedItem();
            }
        });

        jPanel.add(jScrollPane, new myGridBagConstraints(0, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST).setInset(10, 20, 0, 20));
//        jPanel.add(jButton, new myGridBagConstraints(0, 4, 0, 0, 0, 0).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER).setInset(10, 20, 0, 20));
        jFrame.add(jPanel);
    }

    class ParamData {
        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getWay() {
            return way;
        }

        public void setWay(String way) {
            this.way = way;
        }

        int level;
        String way;

        public Boolean getFirstLevel() {
            return isFirstLevel;
        }

        public void setFirstLevel(Boolean firstLevel) {
            isFirstLevel = firstLevel;
        }

        Boolean isFirstLevel;

        public ParamData(int level, String way, Boolean isFirstLevel) {
            this.level = level;
            this.way = way;
            this.isFirstLevel = isFirstLevel;
        }
    }

    private class ParamTableModel extends DefaultTableModel {

        private String[] colunmHeaders = new String[]{"方法", "参数"};

        public static final boolean CHOOSE = true;

        public static final boolean UNCHOOSE = false;

        private ArrayList<ParamData> paramDatas = new ArrayList<>();

        public ParamTableModel(ArrayList<ParamData> paramDatas) {
            this.paramDatas = paramDatas;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 1;
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
                case 0:
                    paramDatas.get(row).setLevel((int) aValue);
                    break;
                case 1:
                    paramDatas.get(row).setWay((String) aValue);
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
                    return paramDatas.get(rowIndex).getLevel();
                case 1:
                    return paramDatas.get(rowIndex).getWay();
                default:
                    return super.getValueAt(rowIndex, columnIndex);
            }
        }
    }

    ActionListener actionListenerconfirm = e -> {
        if (e.getSource() == jButton) {
            System.out.println(1);
        }
    };
}
