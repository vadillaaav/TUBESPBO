package tubes;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class dosen extends javax.swing.JFrame {
    private DefaultListModel<String> list;
//    private LoginDosen 

    public dosen() {
        initComponents();
        list = new DefaultListModel();
        showMatkul();
    }
    
    private void showMatkul(){
            try {
                String query = "SELECT matakuliah FROM matakuliah";
                java.sql.Connection conn = (Connection)connection.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery();

                DefaultListModel<String> list = new DefaultListModel<>();

                while (rs.next()){
                    String matkul = rs.getString("matakuliah");
                    list.addElement(matkul);
                }

                listMatkul.setModel(list);

                rs.close();
                pst.close();
                conn.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitungNilai = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nipLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        nipAngka = new javax.swing.JTextField();
        vadillaText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMatkul = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        quizW1 = new javax.swing.JLabel();
        quizW12 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        w1Text = new javax.swing.JTextField();
        w12Text = new javax.swing.JTextField();
        hasilText = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        perkalian = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        pembagian = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNilai = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nipLabel.setText("NIP:");

        namaLabel.setText("Nama:");

        nipAngka.setText("1303210047");

        vadillaText.setText("Vadilla Vansya Valisca");
        vadillaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vadillaTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nipLabel)
                    .addComponent(namaLabel))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nipAngka)
                    .addComponent(vadillaText, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nipLabel)
                    .addComponent(nipAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(vadillaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        hitungNilai.addTab("Profile", jPanel1);

        jScrollPane2.setViewportView(listMatkul);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        hitungNilai.addTab("Mata Kuliah", jPanel2);

        quizW1.setText("Quiz W1");

        quizW12.setText("Quiz W12");

        hasil.setText("Hasil");

        w1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1TextActionPerformed(evt);
            }
        });

        w12Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w12TextActionPerformed(evt);
            }
        });

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        perkalian.setText("Perkalian");
        perkalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perkalianActionPerformed(evt);
            }
        });

        kurang.setText("Kurang");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        pembagian.setText("Pembagian");
        pembagian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembagianActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quizW1)
                            .addComponent(hasil)
                            .addComponent(quizW12))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w12Text, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(w1Text)
                                .addComponent(hasilText, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                    .addComponent(tambah)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(perkalian)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(kurang)
                                .addGap(53, 53, 53)
                                .addComponent(reset))
                            .addComponent(pembagian))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizW1)
                    .addComponent(w1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizW12)
                    .addComponent(w12Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasil)
                    .addComponent(hasilText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(kurang)
                    .addComponent(reset))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pembagian)
                    .addComponent(perkalian))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        hitungNilai.addTab("Hitung Nilai", jPanel4);

        tableNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1303213018", "Singgar Namora Harahap", "81"},
                {"1303210141", "Nayla Fatimatuzzahra", "86"},
                {"1303210164", "Maritza Amalia Ika Laksana", "89"},
                {"1303210012", "Jenifer Valensya Ama", "98"},
                {"1303210090", "Jeni Salwa", "82"}
            },
            new String [] {
                "NIM", "Nama Mahasiswa", "Nilai"
            }
        ));
        jScrollPane1.setViewportView(tableNilai);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        hitungNilai.addTab("Nilai", jPanel5);

        jLabel5.setText("Selamat datang, Vadilla!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(hitungNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitungNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void w12TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w12TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_w12TextActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        int hasil = 0;
        String quizW1 = w1Text.getText();
        String quizW12 =  w12Text.getText();
        int ke1 = Integer.parseInt(quizW1);
        int ke2 = Integer.parseInt(quizW12);
        hasil = ke1 + ke2;
        hasilText.setText("" + hasil);
    }//GEN-LAST:event_tambahActionPerformed

    private void perkalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perkalianActionPerformed
        int hasil = 0;
        String quizW1 = w1Text.getText();
        String quizW12 =  w12Text.getText();
        int ke1 = Integer.parseInt(quizW1);
        int ke2 = Integer.parseInt(quizW12);
        hasil = ke1 * ke2;
        hasilText.setText("" + hasil);
    }//GEN-LAST:event_perkalianActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        int hasil = 0;
        String quizW1 = w1Text.getText();
        String quizW12 =  w12Text.getText();
        int ke1 = Integer.parseInt(quizW1);
        int ke2 = Integer.parseInt(quizW12);
        hasil = ke1 - ke2;
        hasilText.setText("" + hasil);
    }//GEN-LAST:event_kurangActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        hasilText.setText("");
        w1Text.setText("");
        w12Text.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void pembagianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembagianActionPerformed
        int hasil = 0;
        String quizW1 = w1Text.getText();
        String quizW12 =  w12Text.getText();
        int ke1 = Integer.parseInt(quizW1);
        int ke2 = Integer.parseInt(quizW12);
        hasil = ke1 / ke2;
        hasilText.setText("" + hasil);
    }//GEN-LAST:event_pembagianActionPerformed

    private void w1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_w1TextActionPerformed

    private void vadillaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vadillaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vadillaTextActionPerformed

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
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasil;
    private javax.swing.JTextField hasilText;
    private javax.swing.JTabbedPane hitungNilai;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kurang;
    private javax.swing.JList<String> listMatkul;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField nipAngka;
    private javax.swing.JLabel nipLabel;
    private javax.swing.JButton pembagian;
    private javax.swing.JButton perkalian;
    private javax.swing.JLabel quizW1;
    private javax.swing.JLabel quizW12;
    private javax.swing.JButton reset;
    private javax.swing.JTable tableNilai;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField vadillaText;
    private javax.swing.JTextField w12Text;
    private javax.swing.JTextField w1Text;
    // End of variables declaration//GEN-END:variables
}
