/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.QuanLyThongKe;
import java.text.ParseException;

/**
 *
 * @author Nguyen Thi Thu Hien
 */
public class ThongKeKPINhanVien extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeKPINhanVien
     */
    public ThongKeKPINhanVien() {
        initComponents();
        
    }
    public void setChart() throws ParseException {
        // Tạo một đối tượng của lớp QuanLyThongKe
        QuanLyThongKe controller = new QuanLyThongKe();
        
        // Gọi phương thức setDateChart() để cài đặt biểu đồ
        controller.setDateChartNhanVien(this);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelThongKe = new javax.swing.JPanel();

        javax.swing.GroupLayout JPanelThongKeLayout = new javax.swing.GroupLayout(JPanelThongKe);
        JPanelThongKe.setLayout(JPanelThongKeLayout);
        JPanelThongKeLayout.setHorizontalGroup(
            JPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1097, Short.MAX_VALUE)
        );
        JPanelThongKeLayout.setVerticalGroup(
            JPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelThongKe;
    // End of variables declaration//GEN-END:variables
}