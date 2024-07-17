/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Dao.NhaCungCapDao;
import Dao.SanPhamDao;
import Model.NhaCungCap;
import Model.SanPham;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TieuSoi
 */
public class UpdateSanPham extends javax.swing.JDialog {

    /**
     * Creates new form UpdateSanPham
     */

    private SanPham spSelect;
    private HashMap<String, Integer> nhaCungCapMap = new HashMap<>();

    private FormSanPham parent;

    public UpdateSanPham(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.parent = (FormSanPham) parent;
        initComponents();
        setLocationRelativeTo(null);
        loadDataToComboBox();
        displayInfo();
    }

    private UpdateSanPham(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void displayInfo() {
        spSelect = parent.getSanPhamSelect();
        txtTenSanPham.setText(spSelect.getTenSanPham());
        cboDanhMuc.setSelectedItem(spSelect.getDanhMuc());
        txtTacGia.setText(spSelect.getTacGia());
        txtNhaXuatBan.setText(spSelect.getNhaXuatBan());
        txtDonGia.setText(String.valueOf(spSelect.getGiaBanNhap()));
        cboNhaCungCap.setSelectedItem(spSelect.getTenNhaCungCap());
    }

    private void loadDataToComboBox() {
        var nhaCungCapList = NhaCungCapDao.getInstance().selectAll();

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (NhaCungCap ncc : nhaCungCapList) {
            model.addElement(ncc.getTenNhaCungCap());
            nhaCungCapMap.put(ncc.getTenNhaCungCap(), ncc.getMaNhaCungCap()); // Populate the HashMap
        }
        cboNhaCungCap.setModel(model);
    }

    private int getSelectedNhaCungCapId() {
        String selectedName = (String) cboNhaCungCap.getSelectedItem();
        if (selectedName != null) {
            return nhaCungCapMap.get(selectedName);
        }
        return -1; // Or handle the case where no item is selected
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNhaXuatBan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboDanhMuc = new javax.swing.JComboBox<>();
        btnUpdateProduct = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cboNhaCungCap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(23, 87, 183));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CẬP NHẬT THÔNG TIN SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Tên sản phẩm");

        jLabel4.setText("Đơn giá");

        jLabel7.setText("Nhà cung cấp");
        jLabel7.setToolTipText("");

        jLabel8.setText("Nhà Xuất Bản");
        jLabel8.setToolTipText("");

        jLabel9.setText("Tác giả");
        jLabel9.setToolTipText("");

        jLabel10.setText("Danh Mục");

        cboDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sách", "Văn Phòng Phẩm" }));
        cboDanhMuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboDanhMuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDanhMucItemStateChanged(evt);
            }
        });
        cboDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDanhMucActionPerformed(evt);
            }
        });
        cboDanhMuc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboDanhMucPropertyChange(evt);
            }
        });

        btnUpdateProduct.setBackground(new java.awt.Color(23, 87, 183));
        btnUpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProduct.setText("Sửa sản phẩm");
        btnUpdateProduct.setBorder(null);
        btnUpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Huỷ bỏ");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cboNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống" }));
        cboNhaCungCap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNhaCungCapItemStateChanged(evt);
            }
        });
        cboNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNhaCungCapActionPerformed(evt);
            }
        });
        cboNhaCungCap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboNhaCungCapPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtTenSanPham,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 295,
                                                                Short.MAX_VALUE)
                                                        .addComponent(txtTacGia)
                                                        .addComponent(txtDonGia))
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboDanhMuc, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cboNhaCungCap, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtNhaXuatBan)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                201,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 94, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(47, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtTenSanPham,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboDanhMuc,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDanhMucItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cboDanhMucItemStateChanged
        // TODO add your handling code here:

    }// GEN-LAST:event_cboDanhMucItemStateChanged

    private void cboDanhMucActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cboDanhMucActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cboDanhMucActionPerformed

    private void cboDanhMucPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_cboDanhMucPropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_cboDanhMucPropertyChange

    private void btnUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateProductActionPerformed
        try {
            String tenSP = txtTenSanPham.getText().trim();
            String danhMuc = (String) cboDanhMuc.getSelectedItem();
            String tenTG = txtTacGia.getText().trim();
            String nhaXB = txtNhaXuatBan.getText().trim();
            int maNhaCC = getSelectedNhaCungCapId();
            Double donGia = Double.parseDouble(txtDonGia.getText().trim());

            if (tenSP.equals("") || tenTG.equals("") || txtDonGia.equals("") || danhMuc.equals("")
                    || nhaXB.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Cảnh báo",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                spSelect.setTenSanPham(tenSP);
                spSelect.setTacGia(tenTG);
                spSelect.setGiaBanNhap(donGia);
                spSelect.setDanhMuc(danhMuc);
                spSelect.setNhaXuatBan(nhaXB);
                spSelect.setMaNCC(maNhaCC);
                SanPhamDao spDao = new SanPhamDao();
                spDao.update(spSelect);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Update thành công !");
                parent.loadDataToTable(SanPhamDao.getInstance().selectAll());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Update không thành công !", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btnUpdateProductActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_btnCancelActionPerformed

    private void cboNhaCungCapItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_cboNhaCungCapItemStateChanged
        // TODO add your handling code here:
    }// GEN-LAST:event_cboNhaCungCapItemStateChanged

    private void cboNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cboNhaCungCapActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cboNhaCungCapActionPerformed

    private void cboNhaCungCapPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_cboNhaCungCapPropertyChange
        // TODO add your handling code here:
    }// GEN-LAST:event_cboNhaCungCapPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateSanPham dialog = new UpdateSanPham(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdateProduct;
    private javax.swing.JComboBox<String> cboDanhMuc;
    private javax.swing.JComboBox<String> cboNhaCungCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtNhaXuatBan;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
