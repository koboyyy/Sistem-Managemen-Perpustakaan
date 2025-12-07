package App;

import view.*;

/**
 *
 * @author evo
 */
public class App extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(App.class.getName());

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);

        pn_utama.removeAll();
        pn_utama.add(new RiwayatPeminjaman());
        pn_utama.repaint();
        pn_utama.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDasar = new javax.swing.JPanel();
        jpKiri = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        menuRiwayatPeminjaman = new javax.swing.JLabel();
        menuDataBuku = new javax.swing.JLabel();
        menuPeminjaman = new javax.swing.JLabel();
        menuPengembalian = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpKanan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manajemen Perpustakaan");
        setSize(new java.awt.Dimension(1280, 720));

        jpKiri.setBackground(new java.awt.Color(255, 255, 51));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 255));

        menuRiwayatPeminjaman.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuRiwayatPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        menuRiwayatPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-history-24.png"))); // NOI18N
        menuRiwayatPeminjaman.setText("Riwayat Peminjaman");
        menuRiwayatPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRiwayatPeminjamanMouseClicked(evt);
            }
        });

        menuDataBuku.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuDataBuku.setForeground(new java.awt.Color(255, 255, 255));
        menuDataBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-book-24.png"))); // NOI18N
        menuDataBuku.setText("Data Buku");
        menuDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDataBukuMouseClicked(evt);
            }
        });

        menuPeminjaman.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        menuPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-borrow-book-24.png"))); // NOI18N
        menuPeminjaman.setText("Peminjaman");
        menuPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPeminjamanMouseClicked(evt);
            }
        });

        menuPengembalian.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        menuPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-return-book-24 (1).png"))); // NOI18N
        menuPengembalian.setText("Pengembalian");
        menuPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPengembalianMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-member-24.png"))); // NOI18N
        jLabel2.setText("Anggota");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPengembalian)
                    .addComponent(menuPeminjaman)
                    .addComponent(menuDataBuku)
                    .addComponent(menuRiwayatPeminjaman)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menuRiwayatPeminjaman)
                .addGap(18, 18, 18)
                .addComponent(menuDataBuku)
                .addGap(18, 18, 18)
                .addComponent(menuPeminjaman)
                .addGap(18, 18, 18)
                .addComponent(menuPengembalian)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpKiriLayout = new javax.swing.GroupLayout(jpKiri);
        jpKiri.setLayout(jpKiriLayout);
        jpKiriLayout.setHorizontalGroup(
            jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpKiriLayout.setVerticalGroup(
            jpKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpKanan.setBackground(new java.awt.Color(249, 249, 249));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Admin");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-book-32.png"))); // NOI18N
        jLabel1.setText("Manajemen Perpustakaan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpKananLayout = new javax.swing.GroupLayout(jpKanan);
        jpKanan.setLayout(jpKananLayout);
        jpKananLayout.setHorizontalGroup(
            jpKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKananLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpKananLayout.setVerticalGroup(
            jpKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKananLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jpDasarLayout = new javax.swing.GroupLayout(jpDasar);
        jpDasar.setLayout(jpDasarLayout);
        jpDasarLayout.setHorizontalGroup(
            jpDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDasarLayout.createSequentialGroup()
                .addComponent(jpKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jpDasarLayout.setVerticalGroup(
            jpDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        pn_utama.removeAll();
        pn_utama.add(new DataAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void menuPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPengembalianMouseClicked
        new FormPengembalian().setVisible(true);
    }//GEN-LAST:event_menuPengembalianMouseClicked

    private void menuPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPeminjamanMouseClicked
        new FormPeminjaman().setVisible(true);
    }//GEN-LAST:event_menuPeminjamanMouseClicked

    private void menuDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDataBukuMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new DataBuku());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuDataBukuMouseClicked

    private void menuRiwayatPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRiwayatPeminjamanMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new RiwayatPeminjaman());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuRiwayatPeminjamanMouseClicked

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new App().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpDasar;
    private javax.swing.JPanel jpKanan;
    private javax.swing.JPanel jpKiri;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel menuDataBuku;
    private javax.swing.JLabel menuPeminjaman;
    private javax.swing.JLabel menuPengembalian;
    private javax.swing.JLabel menuRiwayatPeminjaman;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
