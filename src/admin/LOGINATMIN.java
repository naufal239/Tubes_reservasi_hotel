/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;import java.sql.DriverManager;
import  tbs.hotel.Db;

public class LOGINATMIN extends javax.swing.JFrame {
  private Connection koneksi;

    public LOGINATMIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_admin = new javax.swing.JTextField();
        txt_passmin = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN ADMIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID ADMIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        txt_id_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_adminActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 340, 29));
        getContentPane().add(txt_passmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 340, 29));

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/q.png"))); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 164, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/WhatsApp Image 2025-01-06 at 16.29.13_cae9a0a4.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1280, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txt_id_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_adminActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
     String username = txt_id_admin.getText();
    String password = String.valueOf(txt_passmin.getPassword());

    // Validasi input kosong
    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tolong isi ID Admin.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tolong isi Password.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String sql = "SELECT * FROM admin WHERE id_admin = ? AND password = ?";
    try (Connection conn = tbs.hotel.Db.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, username);
        pstmt.setString(2, password);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Berhasil");
                new RESERVATION().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "ID Admin atau Password salah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
//     */
// public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            new LOGIN().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_id_admin;
    private javax.swing.JPasswordField txt_passmin;
    // End of variables declaration//GEN-END:variables
}
