/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author FadilaRizka
 */
public class TambahAlternatif extends javax.swing.JDialog {

    /**
     * Creates new form TambahKriteria
     */
    public TambahAlternatif(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        setLocationRelativeTo(null);  
        setTitle("Tambah Data Alternatif");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAlternatif = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        txtMesin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSeater = new javax.swing.JTextField();
        txtTransmisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSimpanA = new app.ButtonTrans();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nama Alternatif");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 6, -1, 33));

        txtAlternatif.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAlternatif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlternatifActionPerformed(evt);
            }
        });
        jPanel1.add(txtAlternatif, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 8, 300, 33));

        txtHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 300, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Harga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 137, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Tahun");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 137, 33));

        txtTahun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 300, 33));

        txtMesin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtMesin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 300, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Seater");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 137, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mesin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 137, 33));

        txtSeater.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtSeater, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 300, 33));

        txtTransmisi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtTransmisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 300, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Transmisi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 137, 33));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 500, 10));

        btnSimpanA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_save_30px.png"))); // NOI18N
        btnSimpanA.setText("Simpan");
        btnSimpanA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSimpanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanAActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpanA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 170, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bag2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTrans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrans1ActionPerformed
        
    }//GEN-LAST:event_buttonTrans1ActionPerformed

    private void txtAlternatifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlternatifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlternatifActionPerformed

    private void btnSimpanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanAActionPerformed
         try {
            String alternatif = txtAlternatif.getText();//1
            String harga = txtHarga.getText();
            double h = Double.parseDouble(harga);//2
            String tahun = txtTahun.getText();
            double t = Double.parseDouble(tahun); //3
            String cc = txtMesin.getText();
            double m = Double.parseDouble(cc);//4
            String seater = txtSeater.getText();
            double s = Double.parseDouble(seater);//5
            String transmisi = txtTransmisi.getText();
            double tr = Double.parseDouble(transmisi);//6
            
            String q = "INSERT INTO alternatif (alternatif, harga, tahun, cc, seater, transmisi) "
                    + "VALUES ('"+alternatif+"','"+h+"','"+t+"','"+m+"','"+s+"','"+tr+"')";//query = ready
            Connection koneksi = Koneksi.konekKeDB();
            Statement st = koneksi.createStatement();
            st.executeUpdate(q);
            this.dispose();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            
            SPK.loadDataAlternatif();
            
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menyimpan data ke database" + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanAActionPerformed

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
            java.util.logging.Logger.getLogger(TambahAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahAlternatif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahAlternatif dialog = new TambahAlternatif(new javax.swing.JFrame(), true);
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
    private app.ButtonTrans btnSimpanA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAlternatif;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtMesin;
    private javax.swing.JTextField txtSeater;
    private javax.swing.JTextField txtTahun;
    private javax.swing.JTextField txtTransmisi;
    // End of variables declaration//GEN-END:variables

}
