/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs.hotel;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public final class RESERVATIONUs extends javax.swing.JFrame {
     private static Connection koneksi; //untuk koneksi
    private DefaultTableModel model; //untuk model tabel pada form
   ResultSet Rs;
   Statement stm;
   Connection con;
   
   
   
    public RESERVATIONUs() {
        initComponents();
        loadUserReservations();
        status.setEnabled(false);
        txt_username.setEnabled(false);
        txt_ktp.setEnabled(false);
        String currentUsername = LOGIN.currentUsername; 
        loadDataToForm(currentUsername);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_tempat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbx_tempat = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txt_ktp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        chk_in = new com.toedter.calendar.JDateChooser();
        chk_out = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_hp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1281, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama lengkap");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Check In");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check Out");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipe");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        txt_nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_namaFocusLost(evt);
            }
        });
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 220, -1));

        txt_tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tempatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("1. Standart");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("2. Superior");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("3. Deluxe");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("4. Executive");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        cbx_tempat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        cbx_tempat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_tempatItemStateChanged(evt);
            }
        });
        cbx_tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tempatActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_tempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HARGA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 220, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("ABOUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 90, 30));

        txt_ktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ktpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 220, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("No.KTP");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Logo Hotel Sulfana.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -10, 90, 90));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/LOG.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 30, 30));
        getContentPane().add(chk_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 220, -1));
        getContentPane().add(chk_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 220, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 60, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "CONFIRMED", "CANCELLED" }));
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
        });
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No hp");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));
        getContentPane().add(txt_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 220, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Reservasi kamar hotel");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 500, 290));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Username");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 220, -1));

        jButton2.setText("Tampilkan data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 150, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/rs.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ClearForm(){
        txt_nama .setText("");
        txt_ktp.setText("");
        chk_in.getDate();
        chk_out.getDate();
        txt_tempat.setText(""); 
        txt_harga.setText(""); 
    }
    
    private void loadDataToForm(String username) {
    try (Connection conn = Db.getConnection()) {
        String sql = "SELECT username, nama,no_ktp FROM users WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    txt_username.setText(rs.getString("username"));
                    txt_nama.setText(rs.getString("nama"));
                    txt_ktp.setText(rs.getString("no_ktp"));
                } else {
                    JOptionPane.showMessageDialog(this, "Data pengguna tidak ditemukan.");
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading user data: " + e.getMessage());
    }
}


    
    private void loadUserReservations() {
    try (Connection conn = Db.getConnection()) {
        model = new DefaultTableModel();
        this.jTable1.setModel(model);
        model.addColumn("nama");
        model.addColumn("Tgl_masuk");
        model.addColumn("Tgl_keluar");
        model.addColumn("tempat");
        model.addColumn("harga");
        model.addColumn("status");

        String sql = "SELECT * FROM reservation WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, LOGIN.currentUsername);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Object[] rowData = {
                        rs.getString("nama"),
                        rs.getDate("check_in"),
                        rs.getDate("check_out"),
                        rs.getString("tipe"),
                        rs.getString("harga"),
                        rs.getString("status")
                    };
                    model.addRow(rowData);
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading reservations: " + e.getMessage());
    }
}


        private Reservasiin createReservation(int type) {
    switch (type) {
        case 1:
            return new StandardReservation();
        case 2:
            return new SuperiorReservation();
        case 3:
            return new DeluxeReservation();
        case 4:
            return new ExecutiveReservation();
        default:
            throw new IllegalArgumentException("Invalid reservation type");
    }
}


     public void hargaHOTEL() {
    int pilihan = cbx_tempat.getSelectedIndex();
    try {
        Reservasiin reservation = createReservation(pilihan);
        int duration = calculateDuration(chk_in.getDate(), chk_out.getDate());
        txt_harga.setText(String.valueOf(reservation.calculatePrice(duration)));
    } catch (IllegalArgumentException e) {
        txt_harga.setText("");
    }
}
   
   
     public void tempat() {
    int pilihan = cbx_tempat.getSelectedIndex();
    try {
        Reservasiin reservation = createReservation(pilihan);
        txt_tempat.setText(reservation.getReservationType());
    } catch (IllegalArgumentException e) {
        txt_tempat.setText("");
    }
}
     
    private int calculateDuration(java.util.Date checkIn, java.util.Date checkOut) {
    if (checkIn == null || checkOut == null) {
        return 0; // Tanggal belum diisi
    }
    long diffInMillis = checkOut.getTime() - checkIn.getTime();
    return (int) (diffInMillis / (1000 * 60 * 60 * 24)); // Konversi milidetik ke hari
}

     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try (Connection conn = Db.getConnection()) {
            String sql = "INSERT INTO reservation (username, nama, no_ktp, no_hp, check_in, check_out, tipe, harga, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                 
                if (txt_username.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Field Username harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (txt_nama.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Field nama harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (txt_ktp.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Field KTP harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (chk_in.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Tanggal Check-In harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (chk_out.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Tanggal Check-Out harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                ps.setString(1, txt_username.getText());
                ps.setString(2, txt_nama.getText());
                ps.setString(3, txt_ktp.getText());
                ps.setString(4, txt_hp.getText());
                ps.setDate(5, new java.sql.Date(chk_in.getDate().getTime()));
                ps.setDate(6, new java.sql.Date(chk_out.getDate().getTime()));
                ps.setString(7, txt_tempat.getText());
                ps.setString(8, txt_harga.getText());
                ps.setString(9, status.getSelectedItem().toString());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Anda Berhasil Melakukan Reservasi");
                ClearForm();
                loadUserReservations(); 
                new THANKS().setVisible(true);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "TERJADI KESALAHAN!! " + e.getMessage());
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_tempatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_tempatItemStateChanged

        
         tempat();
        txt_tempat.setEnabled(false);
         hargaHOTEL();
        txt_harga.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tempatItemStateChanged

    private void txt_namaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namaFocusLost
        
    }//GEN-LAST:event_txt_namaFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MENU().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new about().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tempatActionPerformed

    private void cbx_tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tempatActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        status.setEnabled(false);
    }//GEN-LAST:event_statusActionPerformed

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
        status.setEnabled(false);
    }//GEN-LAST:event_statusMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loadUserReservations();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_ktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ktpActionPerformed

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
//            java.util.logging.Logger.getLogger(RESERVATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RESERVATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RESERVATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RESERVATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new RESERVATIONUs().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_tempat;
    private com.toedter.calendar.JDateChooser chk_in;
    private com.toedter.calendar.JDateChooser chk_out;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_ktp;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_tempat;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void tampildata() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
