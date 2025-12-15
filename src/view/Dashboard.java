package view;

import controller.DbConn;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author evo
 */
public class Dashboard extends javax.swing.JPanel {

    final DbConn dbc = new DbConn();

    public Dashboard() {
        initComponents();
        setStatistik();
    }
    
    public final void setStatistik() {
        setTotalBuku();
        setTotalAnggota();
        setTotalTransaksi();
        setTotalPengembalian();
    }

    public void setTotalBuku() {

        String query = "SELECT COUNT(id_buku) as total_buku FROM buku";

        try {

            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                jlJumlahBuku.setText(rs.getString("total_buku"));
            }

        } catch (SQLException ex) {
            System.out.println("buku");
            System.out.println(ex);
        }

        dbc.putus();
    }

    public void setTotalAnggota() {

        String query = "SELECT COUNT(id_anggota) as total_anggota FROM anggota";

        try {

            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                jlJumlahAnggota.setText(rs.getString("total_anggota"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        dbc.putus();
    }

    public void setTotalTransaksi() {

        String query = "SELECT COUNT(id_transaksi) as total_transaksi FROM transaksi";

        try {

            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                jlJumlahTransaksi.setText(rs.getString("total_transaksi"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        dbc.putus();
    }

    public void setTotalPengembalian() {

        String query = "SELECT COUNT(id_pengembalian) as total_pengembalian FROM pengembalian";

        try {

            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                jlJumlahPengembalian.setText(rs.getString("total_pengembalian"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        dbc.putus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jlJumlahBuku = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jlJumlahAnggota = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jlJumlahTransaksi = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jlJumlahPengembalian = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 32767));
        setMinimumSize(new java.awt.Dimension(1015, 0));
        setPreferredSize(new java.awt.Dimension(1015, 0));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-dashboard-layout-24.png"))); // NOI18N
        jLabel2.setText("Dashboard");

        jPanel2.setMaximumSize(new java.awt.Dimension(1280, 32767));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 14, 0));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buku Tersedia");

        jlJumlahBuku.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jlJumlahBuku.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahBuku.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahBuku)
                    .addComponent(jLabel5))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlJumlahBuku)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.add(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Anggota");

        jlJumlahAnggota.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jlJumlahAnggota.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahAnggota.setText("0");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahAnggota)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jlJumlahAnggota))
        );

        jPanel2.add(kGradientPanel2);

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Transaksi");

        jlJumlahTransaksi.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jlJumlahTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahTransaksi.setText("0");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahTransaksi)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jlJumlahTransaksi))
        );

        jPanel2.add(kGradientPanel3);

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 102, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Pengembalian");

        jlJumlahPengembalian.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        jlJumlahPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahPengembalian.setText("0");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahPengembalian)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jlJumlahPengembalian))
        );

        jPanel2.add(kGradientPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlJumlahAnggota;
    private javax.swing.JLabel jlJumlahBuku;
    private javax.swing.JLabel jlJumlahPengembalian;
    private javax.swing.JLabel jlJumlahTransaksi;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}
