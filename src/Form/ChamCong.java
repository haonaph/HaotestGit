/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.ChamCongDao;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import java.sql.*;
import helper.JdbcHelper;
import helper.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Cao Do
 */
public class ChamCong extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChamCong
     */
    Connection cn;
    ChamCongDao dao = new ChamCongDao();
    public ChamCong() {
        initComponents();
        jTable1.setAutoCreateRowSorter(true);
        String[] a = {
            "C", "CN", "V", "P", "O"
        };
        JComboBox c = new JComboBox(a);
        jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(7).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(9).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(10).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(11).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(18).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(13).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(14).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(15).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(16).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(17).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(18).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(19).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(20).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(21).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(22).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(23).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(24).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(25).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(26).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(27).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(28).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(29).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(30).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(31).setCellEditor(new DefaultCellEditor(c));
        jTable1.getColumnModel().getColumn(32).setCellEditor(new DefaultCellEditor(c));
    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            List<model.ChamCong> list = dao.select();
            for (model.ChamCong cc : list) {
                Object[] row = {
                    cc.getMaNV(), cc.getHoten(), cc.getThang(), cc.getNam(), cc.getD1(), cc.getD2(), cc.getD3(), cc.getD4(),
                    cc.getD5(), cc.getD6(), cc.getD7(), cc.getD8(), cc.getD9(), cc.getD10(), cc.getD11(), cc.getD12(),
                    cc.getD13(), cc.getD14(), cc.getD15(), cc.getD16(), cc.getD17(), cc.getD18(), cc.getD19(), cc.getD20(),
                    cc.getD21(), cc.getD22(), cc.getD23(), cc.getD24(), cc.getD25(), cc.getD26(), cc.getD27(), cc.getD28(),
                    cc.getD29(), cc.getD30(), cc.getD31()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    void SelectFromCbb() {
        try {
            String sql = "SELECT * FROM CHAMCONG where Thang like '%?%' and Nam = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);

        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PhongBan = new javax.swing.JComboBox<>();
        Thang = new javax.swing.JComboBox<>();
        Nam = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TimKiem = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1900, 1000));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        PhongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Tháng", "Năm", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setInheritsPopupMenu(true);
        jTable1.setMaximumSize(new java.awt.Dimension(1900, 1000));
        jTable1.setMinimumSize(new java.awt.Dimension(1900, 1000));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        this.load();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Nam;
    private javax.swing.JComboBox<String> PhongBan;
    private javax.swing.JComboBox<String> Thang;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
