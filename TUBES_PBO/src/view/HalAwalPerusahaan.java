package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class HalAwalPerusahaan extends javax.swing.JFrame {

    public HalAwalPerusahaan() {
        initComponents();
    }

    public JButton getBtnBuatLowongan() {
        return btnBuatLowongan;
    }

    public JButton getBtnTambahPerusahaan() {
        return btnTambahPerusahaan;
    }
    
    public void addListener(ActionListener e){
        btnBuatLowongan.addActionListener(e);
        btnTambahPerusahaan.addActionListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambahPerusahaan = new javax.swing.JButton();
        btnBuatLowongan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Awal Pelamar");

        btnTambahPerusahaan.setText("Tambah Perusahaan");
        btnTambahPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPerusahaanActionPerformed(evt);
            }
        });

        btnBuatLowongan.setText("Buat Lowongan");
        btnBuatLowongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatLowonganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambahPerusahaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuatLowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnTambahPerusahaan)
                .addGap(39, 39, 39)
                .addComponent(btnBuatLowongan)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahPerusahaanActionPerformed

    private void btnBuatLowonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatLowonganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuatLowonganActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuatLowongan;
    private javax.swing.JButton btnTambahPerusahaan;
    // End of variables declaration//GEN-END:variables
}
