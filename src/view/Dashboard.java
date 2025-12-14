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

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-dashboard-layout-24.png"))); // NOI18N
        jLabel2.setText("Dashboard");

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 14, 0));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buku Tersedia");

        jlJumlahBuku.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlJumlahBuku.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahBuku.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahBuku)
                    .addComponent(jLabel5))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlJumlahBuku)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel2.add(kGradientPanel1);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Anggota");

        jlJumlahAnggota.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlJumlahAnggota.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahAnggota.setText("0");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahAnggota)
                    .addComponent(jLabel1))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlJumlahAnggota)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel2.add(kGradientPanel2);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Transaksi");

        jlJumlahTransaksi.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlJumlahTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahTransaksi.setText("0");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahTransaksi)
                    .addComponent(jLabel3))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlJumlahTransaksi)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel2.add(kGradientPanel3);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Pengembalian");

        jlJumlahPengembalian.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jlJumlahPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        jlJumlahPengembalian.setText("0");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlJumlahPengembalian)
                    .addComponent(jLabel4))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlJumlahPengembalian)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel2.add(kGradientPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1279, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
