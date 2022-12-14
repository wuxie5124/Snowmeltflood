import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;

public class UI2 extends UI0 {
    //第二页
//    public ArrayList<Major.MLParam> mlParams;
    private JTable jTable;
    private ArrayList<UI1.ParamData> paramList;
    private ParamTableModel paramTableModel;


    JPanel jPanel1;

    JPanel jPanel2;
    JButton jButton;
    JRadioButton jRadioButton1;

    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JRadioButton jRadioButton5;
    JRadioButton jRadioButton6;
    ButtonGroup group;

    ArrayList<ParamData> listParams;

    String ActiveMLWay;

    ArrayList<ArrayList<ParamData>> tableData;

    @Override
    public void createUI(ArrayList<UI1.ParamData> paramList) {
        this.paramList = paramList;
        intData();
        initComponent();
        initActionListener();
    }

    private void intData() {
        if (this.tableData.size() == 0) {
            this.tableData = new ArrayList<>();
            for (int i = 0; i < this.paramList.size(); i++) {
                {
                    String wayName = paramList.get(i).getWay();
                    MLAndParam mlAndParam = paramHashMaps.get(wayName);
                    ArrayList<ParamAndValue> param = mlAndParam.getParam();
                    ArrayList<ParamData> Params = new ArrayList<>();
                    for (ParamAndValue paramAndValue : param) {
                        Params.add(new ParamData(paramAndValue.getParamName(), paramAndValue.getParamValue().get(0)));
                    }
                    this.tableData.add(Params);
                }
            }
        }
    }

    private Major.MLParam one;

    private Major.MLParam two;
    private Major.MLParam three;
    private Major.MLParam four;
    private Major.MLParam five;
    private Major.MLParam six;

    public UI2(JFrame jFrame, JPanel jPanel, ArrayList<ArrayList<ParamData>> tableData) {
        super(jFrame, jPanel);
        this.tableData = tableData;
    }

    private ActionListener RadioActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jRadioButton1) {
                UI2.this.ActiveMLWay = paramList.get(0).getWay();
                listParams = tableData.get(0);
            } else if (e.getSource() == jRadioButton2) {
                UI2.this.ActiveMLWay = paramList.get(1).getWay();
                listParams = tableData.get(1);
            } else if (e.getSource() == jRadioButton3) {
                UI2.this.ActiveMLWay = paramList.get(2).getWay();
                listParams = tableData.get(2);
            } else if (e.getSource() == jRadioButton4) {
                UI2.this.ActiveMLWay = paramList.get(3).getWay();
                listParams = tableData.get(3);
            } else if (e.getSource() == jRadioButton5) {
                UI2.this.ActiveMLWay = paramList.get(4).getWay();
                listParams = tableData.get(4);
            } else if (e.getSource() == jRadioButton6) {
                UI2.this.ActiveMLWay = paramList.get(5).getWay();
                listParams = tableData.get(5);
            }
            paramTableModel = new ParamTableModel(listParams);
            jTable.setModel(paramTableModel);
            setEditorAndRender();
        }
    };

    private void initActionListener() {
        this.jRadioButton1.addActionListener(RadioActionListener);
        this.jRadioButton2.addActionListener(RadioActionListener);
        this.jRadioButton3.addActionListener(RadioActionListener);
        this.jRadioButton4.addActionListener(RadioActionListener);
        this.jRadioButton5.addActionListener(RadioActionListener);
        this.jRadioButton6.addActionListener(RadioActionListener);

        this.jButton.addActionListener(e -> {

            System.out.println("111");
//            this.mlParams.removeAll(this.mlParams);
//            this.mlParams.add(one);
//            this.mlParams.add(two);
//            this.mlParams.add(three);
//            this.mlParams.add(four);
//            this.mlParams.add(five);
//            this.mlParams.add(six);
        });
    }

    public void initComponent() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();

        this.jButton = new JButton("确定");
        this.jPanel.add(jPanel1, new myGridBagConstraints(0, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        this.jPanel.add(jPanel2, new myGridBagConstraints(1, 0, 1, 3, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.NORTHWEST));
        this.jPanel.add(jButton, new myGridBagConstraints(0, 3, 2, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.setLayout(gridBagLayout);
        this.jPanel2.setLayout(gridBagLayout);
        this.jPanel1.setPreferredSize(new Dimension(200, 350));
        this.jPanel2.setPreferredSize(new Dimension(320, 350));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("方法"));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder("参数"));
        this.jRadioButton1 = new JRadioButton("第一层方法1");
        this.jRadioButton2 = new JRadioButton("第一层方法2");
        this.jRadioButton3 = new JRadioButton("第一层方法3");
        this.jRadioButton4 = new JRadioButton("第一层方法4");
        this.jRadioButton5 = new JRadioButton("第一层方法5");
        this.jRadioButton6 = new JRadioButton("第二层方法1");
//        this.jRadioButton1.setSelected(true);
        this.group = new ButtonGroup();
        this.group.add(jRadioButton1);
        this.group.add(jRadioButton2);
        this.group.add(jRadioButton3);
        this.group.add(jRadioButton4);
        this.group.add(jRadioButton5);
        this.group.add(jRadioButton6);

        this.jPanel1.add(jRadioButton1, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.add(jRadioButton2, new myGridBagConstraints(0, 1, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.add(jRadioButton3, new myGridBagConstraints(0, 2, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.add(jRadioButton4, new myGridBagConstraints(0, 3, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.add(jRadioButton5, new myGridBagConstraints(0, 4, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        this.jPanel1.add(jRadioButton6, new myGridBagConstraints(0, 5, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        for (int i = 0; i < paramList.size(); i++) {
            jPanel1.add(new JLabel(paramList.get(i).getWay()), new myGridBagConstraints(1, i, 1, 1, 1, 1).setFill(GridBagConstraints.NONE).setAnchor(GridBagConstraints.CENTER));
        }
        this.ActiveMLWay = paramList.get(0).getWay();
        this.jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable);
        this.listParams = tableData.get(0);
        this.paramTableModel = new ParamTableModel(this.listParams);
        this.jTable.setModel(paramTableModel);
        setEditorAndRender();

        this.jPanel2.add(jScrollPane, new myGridBagConstraints(0, 0, 1, 1, 1, 1).setFill(GridBagConstraints.BOTH).setAnchor(GridBagConstraints.CENTER));
        this.jFrame.add(jPanel);
    }

//    private void freshTable() {
//        this.paramTableModel = new ParamTableModel(this.listParams);
//        this.jTable.setModel(paramTableModel);
//    }

    private void setEditorAndRender() {
        this.jTable.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            JSpinner jSpinner = new JSpinner();
            SpinnerModel spinnerModel;

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                String paramName = listParams.get(row).getParamName();
                ParamAndValue param = paramHashMaps.get(ActiveMLWay).getParamByName(paramName);
                spinnerModel = new SpinnerListModel(param.getParamValue());
                jSpinner.setModel(spinnerModel);
                jSpinner.setValue((String) value);
                return jSpinner;
            }
        });
        this.jTable.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JTextField()) {
            JSpinner jSpinner = new JSpinner();
            SpinnerModel spinnerModel;

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                String paramName = listParams.get(row).getParamName();
                ParamAndValue param = paramHashMaps.get(ActiveMLWay).getParamByName(paramName);
                spinnerModel = new SpinnerListModel(param.getParamValue());
                jSpinner.setModel(spinnerModel);
                jSpinner.setValue((String) value);
                return jSpinner;
            }


            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return true;
            }

            @Override
            public Object getCellEditorValue() {
                return jSpinner.getValue();
            }
        });
        this.jTable.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                int height = table.getRowHeight();
                this.setHorizontalAlignment(CENTER);
                table.setRowHeight(row, (int) (height * 2.5));
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
    }

    public class ParamData {

        public String getParamName() {
            return ParamName;
        }

        public void setParamName(String paramName) {
            ParamName = paramName;
        }

        public String getParamValue() {
            return ParamValue;
        }

        public void setParamValue(String paramValue) {
            ParamValue = paramValue;
        }

        String ParamName;
        String ParamValue;

        public ParamData(String paramName, String paramValue) {
            ParamName = paramName;
            ParamValue = paramValue;
        }
    }

    private class ParamTableModel extends DefaultTableModel {

        private String[] colunmHeaders = new String[]{"参数", "数值"};

        private ArrayList<ParamData> paramDatas;

        public void setParamDatas(ArrayList<ParamData> paramDatas) {
            this.paramDatas = paramDatas;
        }

        public ParamTableModel(ArrayList<ParamData> paramDatas) {
            this.paramDatas = paramDatas;
        }


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
                    paramDatas.get(row).setParamName((String) aValue);
                    break;
                case 1:
                    paramDatas.get(row).setParamValue((String) aValue);
                    break;
                default:
                    super.setValueAt(aValue, row, column);
            }
            this.fireTableCellUpdated(row, column);
        }

        @Override
        public Object getValueAt(int row, int column) {
            switch (column) {
                case 0:
                    return paramDatas.get(row).getParamName();
                case 1:
                    return paramDatas.get(row).getParamValue();
                default:
                    return super.getValueAt(row, column);
            }
        }
    }

    private void addValue() {
        MLAndParam mlAndParam = paramHashMaps.get(ActiveMLWay);
        ArrayList<ParamAndValue> param = mlAndParam.getParam();
        this.listParams = new ArrayList<>();

        for (ParamAndValue paramAndValue : param) {
            this.listParams.add(new ParamData(paramAndValue.getParamName(), paramAndValue.getParamValue().get(0)));
        }
    }
}
