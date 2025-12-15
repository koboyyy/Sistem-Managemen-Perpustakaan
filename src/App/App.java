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
        pn_utama.add(new Dashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDasar = new javax.swing.JPanel();
        SideBar = new keeptoo.KGradientPanel();
        menuRiwayatPeminjaman = new javax.swing.JLabel();
        menuStatisktik = new javax.swing.JLabel();
        menuPeminjaman = new javax.swing.JLabel();
        menuAnggota = new javax.swing.JLabel();
        menuDataBuku = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainSection = new javax.swing.JScrollPane();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perpustakaan Ustadz Sukirman");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        jpDasar.setBackground(new java.awt.Color(255, 255, 51));
        jpDasar.setPreferredSize(new java.awt.Dimension(1465, 900));

        SideBar.setkEndColor(new java.awt.Color(0, 204, 255));
        SideBar.setkStartColor(new java.awt.Color(0, 102, 255));

        menuRiwayatPeminjaman.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuRiwayatPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        menuRiwayatPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-history-24.png"))); // NOI18N
        menuRiwayatPeminjaman.setText("Transaksi");
        menuRiwayatPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRiwayatPeminjamanMouseClicked(evt);
            }
        });

        menuStatisktik.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuStatisktik.setForeground(new java.awt.Color(255, 255, 255));
        menuStatisktik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-dashboard-layout-24 (1).png"))); // NOI18N
        menuStatisktik.setText("Dashboard");
        menuStatisktik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStatisktikMouseClicked(evt);
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

        menuAnggota.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        menuAnggota.setForeground(new java.awt.Color(255, 255, 255));
        menuAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-member-24.png"))); // NOI18N
        menuAnggota.setText("Anggota");
        menuAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAnggotaMouseClicked(evt);
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

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPeminjaman)
                    .addComponent(menuStatisktik)
                    .addComponent(menuRiwayatPeminjaman)
                    .addComponent(menuAnggota)
                    .addComponent(menuDataBuku))
                .addGap(20, 20, 20))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menuStatisktik)
                .addGap(18, 18, 18)
                .addComponent(menuDataBuku)
                .addGap(18, 18, 18)
                .addComponent(menuAnggota)
                .addGap(18, 18, 18)
                .addComponent(menuPeminjaman)
                .addGap(18, 18, 18)
                .addComponent(menuRiwayatPeminjaman)
                .addContainerGap(643, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Dashboard Admin");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/logo_kecil.png"))); // NOI18N
        jLabel1.setText("Perpustakaan Ustadz Sukirman");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 981, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainSection.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());
        MainSection.setViewportView(pn_utama);

        javax.swing.GroupLayout jpDasarLayout = new javax.swing.GroupLayout(jpDasar);
        jpDasar.setLayout(jpDasarLayout);
        jpDasarLayout.setHorizontalGroup(
            jpDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDasarLayout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainSection))
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpDasarLayout.setVerticalGroup(
            jpDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDasarLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainSection)
                    .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpDasar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpDasar, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAnggotaMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new DataAnggota());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuAnggotaMouseClicked

    private void menuPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPeminjamanMouseClicked
        new FormPeminjaman().setVisible(true);
    }//GEN-LAST:event_menuPeminjamanMouseClicked

    private void menuStatisktikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStatisktikMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new Dashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuStatisktikMouseClicked

    private void menuRiwayatPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRiwayatPeminjamanMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new Transaksi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuRiwayatPeminjamanMouseClicked

    private void menuDataBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDataBukuMouseClicked
        pn_utama.removeAll();
        pn_utama.add(new DataBuku());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_menuDataBukuMouseClicked

    
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(() -> new App().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JScrollPane MainSection;
    private keeptoo.KGradientPanel SideBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpDasar;
    private javax.swing.JLabel menuAnggota;
    private javax.swing.JLabel menuDataBuku;
    private javax.swing.JLabel menuPeminjaman;
    private javax.swing.JLabel menuRiwayatPeminjaman;
    private javax.swing.JLabel menuStatisktik;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
