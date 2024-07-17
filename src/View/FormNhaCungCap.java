/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.SearchNhaCungCap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.*;
import Dao.NhaCungCapDao;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author TieuSoi
 */
public class FormNhaCungCap extends javax.swing.JInternalFrame {

    private DefaultTableModel tblModel;
    private static ArrayList<NhaCungCap> armt;

    /**
     * Creates new form FormNhaCungCap
     */
    public FormNhaCungCap() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        tblNCC.setDefaultEditor(Object.class, null);
        initTable();
        armt = NhaCungCapDao.getInstance().selectAll();
        loadDataToTable(armt);
    }

    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[] { "Mã NCC", "Tên nhà cung cấp", "Người Liên Hệ", "Số điện thoại", "Email" };
        tblModel.setColumnIdentifiers(headerTbl);
        tblNCC.setModel(tblModel);
        tblNCC.getColumnModel().getColumn(0).setPreferredWidth(1);
        tblNCC.getColumnModel().getColumn(1).setPreferredWidth(300);
        tblNCC.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblNCC.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblNCC.getColumnModel().getColumn(4).setPreferredWidth(200);
    }

    public void loadDataToTable(ArrayList<NhaCungCap> ncc) {
        try {
            tblModel.setRowCount(0);
            for (NhaCungCap i : ncc) {
                tblModel.addRow(new Object[] {
                        i.getMaNhaCungCapCode(), i.getTenNhaCungCap(), i.getNguoiLienHe(), i.getSoDienThoai(),
                        i.getEmail()
                });
            }
        } catch (Exception e) {
        }
    }

    public NhaCungCap getNhaCungCapSelect() {
        int i_row = tblNCC.getSelectedRow();
        NhaCungCap ncc = NhaCungCapDao.getInstance().selectAll().get(i_row);
        return ncc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        exportExcel = new javax.swing.JButton();
        importExcel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbxlLuaChon = new javax.swing.JComboBox<>();
        txtSearchForm = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();

        jScrollPane2.setViewportView(jEditorPane1);

        setPreferredSize(new java.awt.Dimension(1200, 765));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jToolBar1.setRollover(true);

        btnAdd.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add_icon_24.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAdd.setVerifyInputWhenFocusTarget(false);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdd);

        jButton4.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/error_icon_24.png"))); // NOI18N
        jButton4.setText("Xoá");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton4.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/write_icon_24.png"))); // NOI18N
        jButton5.setText("Sửa");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton5.setMinimumSize(new java.awt.Dimension(80, 80));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator1);

        exportExcel.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        exportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/excel_icon_24.png"))); // NOI18N
        exportExcel.setText("Xuất Excel");
        exportExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportExcel.setMaximumSize(new java.awt.Dimension(80, 80));
        exportExcel.setMinimumSize(new java.awt.Dimension(80, 80));
        exportExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(exportExcel);

        importExcel.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        importExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_export_excel.png"))); // NOI18N
        importExcel.setText("Nhập Excel");
        importExcel.setFocusable(false);
        importExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        importExcel.setMaximumSize(new java.awt.Dimension(80, 80));
        importExcel.setMinimumSize(new java.awt.Dimension(80, 80));
        importExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        importExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExcelActionPerformed(evt);
            }
        });
        jToolBar1.add(importExcel);

        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxlLuaChon.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        cbxlLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã nhà cung cấp",
                "Tên nhà cung cấp", "Người Liên Hệ", "Số điện thoại", "Email" }));
        jPanel3.add(cbxlLuaChon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 40));

        txtSearchForm.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        txtSearchForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFormActionPerformed(evt);
            }
        });
        txtSearchForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchFormKeyPressed(evt);
            }

            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFormKeyReleased(evt);
            }
        });
        jPanel3.add(txtSearchForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 400, 40));

        btnReset.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icon_refesh.png"))); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 760, 90));

        jScrollPane1.setBorder(null);

        tblNCC.setFont(new java.awt.Font("SF Pro Display", 0, 15)); // NOI18N
        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null }
                },
                new String[] {
                        "Mã NCC", "Tên nhà cung cấp", "Người liên hệ", "Số điện thoại", "Email"
                }) {
            Class[] types = new Class[] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class,
                    java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNCC);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1160, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddNhaCungCap a = new AddNhaCungCap(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this),
                rootPaneCheckingEnabled);
        a.setVisible(true);
    }// GEN-LAST:event_btnAddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // // TODO add your handling code here:
        if (tblNCC.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm muốn xoá");
        } else {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá nhà cung cấp",
                    "Xác nhận xoá nhà cung cấp", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                NhaCungCapDao.getInstance().delete(getNhaCungCapSelect());
                JOptionPane.showMessageDialog(this, "Xóa thành công !");
                loadDataToTable(NhaCungCapDao.getInstance().selectAll());
            }
        }
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        if (tblNCC.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp muốn sửa");
        } else {
            UpdateNhaCungCap up = new UpdateNhaCungCap(this,
                    (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), rootPaneCheckingEnabled);
            up.setVisible(true);
        }
    }// GEN-LAST:event_jButton5ActionPerformed

    private void exportExcelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exportExcelActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("NhaCungCap");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tblNCC.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tblNCC.getColumnName(i));
                }

                for (int j = 0; j < tblNCC.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tblNCC.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tblNCC.getValueAt(j, k) != null) {
                            cell.setCellValue(tblNCC.getValueAt(j, k).toString());
                        }

                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// GEN-LAST:event_exportExcelActionPerformed

    private void importExcelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_importExcelActionPerformed
        // TODO add your handling code here:
        // Import excel
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelJTableImport = null;
        ArrayList<NhaCungCap> listAccExcel = new ArrayList<NhaCungCap>();
        JFileChooser jf = new JFileChooser();
        int result = jf.showOpenDialog(null);
        jf.setDialogTitle("Open file");
        Workbook workbook = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = jf.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
                for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);
                    String maNhaCungCap = excelRow.getCell(0).getStringCellValue();
                    String tenNhaCungCap = excelRow.getCell(1).getStringCellValue();
                    String nguoiLienHe = excelRow.getCell(2).getStringCellValue();
                    String sdt = excelRow.getCell(3).getStringCellValue();
                    String email = excelRow.getCell(4).getStringCellValue();
                    NhaCungCap acc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, nguoiLienHe, sdt, email);
                    listAccExcel.add(acc);
                    DefaultTableModel table_acc = (DefaultTableModel) tblNCC.getModel();
                    table_acc.setRowCount(0);
                    loadDataToTable(listAccExcel);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FormNhaCungCap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FormNhaCungCap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            int k = 0;
            for (NhaCungCap nhaCungCap : listAccExcel) {
                k = NhaCungCapDao.getInstance().insert(nhaCungCap);
            }
            if (k != 0) {
                JOptionPane.showMessageDialog(this, "Import thành công !");
            }
        } catch (Exception e) {
        }
    }// GEN-LAST:event_importExcelActionPerformed

    private void txtSearchFormActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchFormActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSearchFormActionPerformed

    private void txtSearchFormKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSearchFormKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSearchFormKeyPressed

    private void txtSearchFormKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSearchFormKeyReleased
        // TODO add your handling code here:
        String luachon = (String) cbxlLuaChon.getSelectedItem();
        String searchContent = txtSearchForm.getText();
        ArrayList<NhaCungCap> result = new ArrayList<>();
        switch (luachon) {
            case "Tất cả":
                result = SearchNhaCungCap.getInstance().searchTatCa(searchContent);
                break;
            case "Mã nhà cung cấp":
                result = SearchNhaCungCap.getInstance().searchMaNCC(searchContent);
                break;
            case "Tên nhà cung cấp":
                result = SearchNhaCungCap.getInstance().searchTenNCC(searchContent);
                break;
            case "Email":
                result = SearchNhaCungCap.getInstance().searchEmail(searchContent);
                break;
            case "Số điện thoại":
                result = SearchNhaCungCap.getInstance().searchSdt(searchContent);
                break;

            case "Người Liên Hệ":
                result = SearchNhaCungCap.getInstance().searchNguoiLienHe(searchContent);
                break;
        }
        loadDataToTable(result);
    }// GEN-LAST:event_txtSearchFormKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtSearchForm.setText("");
        cbxlLuaChon.setSelectedIndex(0);
        loadDataToTable(NhaCungCapDao.getInstance().selectAll());
    }// GEN-LAST:event_btnResetActionPerformed

    private void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbxlLuaChon;
    private javax.swing.JButton exportExcel;
    private javax.swing.JButton importExcel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtSearchForm;
    // End of variables declaration//GEN-END:variables
}
