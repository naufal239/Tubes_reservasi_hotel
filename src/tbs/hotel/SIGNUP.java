/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs.hotel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SIGNUP extends javax.swing.JFrame {
private static Connection koneksi;
    private DefaultTableModel model;
    private String username;
    private String password;
    private String nama;
    private String Alamat;
    private String No_hp;
   private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    
    public SIGNUP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txt_nohp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        txt_alamat = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ktp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 719));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 188, 45));

        txt_nohp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nohpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 420, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN UP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No_hp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        txt_username.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 420, -1));

        txt_pass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 420, -1));

        txt_alamat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 420, -1));

        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 87, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Nama lengkap");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, -1, 844));

        txt_name.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 420, 22));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No ktp");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        txt_ktp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(txt_ktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 420, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/WhatsApp Image 2025-01-06 at 16.51.43_5fc767a1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new LOGIN().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try (Connection conn = Db.getConnection()) {
            String sql = "INSERT INTO users (username, password, nama, alamat, no_hp,no_ktp) VALUES (?, ?, ?, ?, ?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, txt_username.getText());
                ps.setString(2, new String(txt_pass.getPassword()));
                ps.setString(3, txt_name.getText());
                ps.setString(4, txt_alamat.getText());
                ps.setString(5, txt_nohp.getText());
                ps.setString(6, txt_ktp.getText());
                
                if (txt_username.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
                }
                if (txt_pass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
                }
                if (txt_name.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                if (txt_alamat.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (txt_nohp.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (txt_nohp.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Tolong isi semua data", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!isNumeric(txt_nohp.getText())) {
                 JOptionPane.showMessageDialog(this, "Nomor telepon harus berupa angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
                }
                if (!isNumeric(txt_ktp.getText())) {
                    JOptionPane.showMessageDialog(this, "Nomor KTP harus berupa angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Anda Telah terdaftar menjadi member Sulfana hotel");
                new LOGIN().setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN!! " + e.getMessage());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nohpActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed


    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new SIGNUP().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_ktp;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_nohp;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
