/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykho;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static quanlykho.Main.taikhoan;

/**
 *
 * @author admin
 */
public class Jframe_QL extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_QL
     */
    public Jframe_QL() {
        initComponents();
        txtTenQL.setText(taikhoan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        txtTenQL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonSuaKhoHang = new javax.swing.JButton();
        jButtonSuaNV = new javax.swing.JButton();
        jButtonTinhDoanhThu = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jButtonSuaNV1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/quanly.png"))); // NOI18N
        jLabel1.setText("Quản lý:");

        txtTenQL.setEditable(false);
        txtTenQL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Chức năng:");

        jButtonSuaKhoHang.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSuaKhoHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonSuaKhoHang.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSuaKhoHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chứcnang.jpg"))); // NOI18N
        jButtonSuaKhoHang.setText("Sửa thông tin kho hàng");
        jButtonSuaKhoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaKhoHangActionPerformed(evt);
            }
        });

        jButtonSuaNV.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSuaNV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonSuaNV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chứcnang.jpg"))); // NOI18N
        jButtonSuaNV.setText("Sửa thông tin nhân viên");
        jButtonSuaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaNVActionPerformed(evt);
            }
        });

        jButtonTinhDoanhThu.setBackground(new java.awt.Color(0, 153, 0));
        jButtonTinhDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonTinhDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTinhDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/doanhthu.png"))); // NOI18N
        jButtonTinhDoanhThu.setText("Tính doanh thu");
        jButtonTinhDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTinhDoanhThuActionPerformed(evt);
            }
        });

        jButtonThoat.setBackground(new java.awt.Color(255, 255, 255));
        jButtonThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonThoat.setForeground(new java.awt.Color(204, 0, 0));
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        jButtonSuaNV1.setBackground(new java.awt.Color(0, 153, 0));
        jButtonSuaNV1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonSuaNV1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSuaNV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/taikhoan.png"))); // NOI18N
        jButtonSuaNV1.setText("Sửa thông tin cá nhân");
        jButtonSuaNV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaNV1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenQL, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSuaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSuaKhoHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTinhDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSuaNV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButtonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTinhDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSuaKhoHang)
                .addGap(27, 27, 27)
                .addComponent(jButtonSuaNV)
                .addGap(26, 26, 26)
                .addComponent(jButtonSuaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSuaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaNVActionPerformed
        // TODO add your handling code here:
        Jframe_SuaNV j=new Jframe_SuaNV();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSuaNVActionPerformed

    private void jButtonSuaKhoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaKhoHangActionPerformed
        try {
            // TODO add your handling code here:
            Jframe_SuaKhoHang j=new Jframe_SuaKhoHang();
            j.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Jframe_QL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSuaKhoHangActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        Jframe_DN j=new Jframe_DN();
        j.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jButtonTinhDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTinhDoanhThuActionPerformed
        // TODO add your handling code here:
        Jframe_DoanhThu j=new Jframe_DoanhThu();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTinhDoanhThuActionPerformed

    private void jButtonSuaNV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaNV1ActionPerformed
        Jframe_QLCN k=new Jframe_QLCN();
        k.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSuaNV1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframe_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_QL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_QL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSuaKhoHang;
    private javax.swing.JButton jButtonSuaNV;
    private javax.swing.JButton jButtonSuaNV1;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JButton jButtonTinhDoanhThu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTenQL;
    // End of variables declaration//GEN-END:variables
}
