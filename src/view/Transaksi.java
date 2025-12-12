package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import controller.DbConn;

/**
 *
 * @author evo
 */
public class Transaksi extends javax.swing.JPanel {

//    Koneksi Database
    final DbConn dbc = new DbConn();

    public Transaksi() {
        initComponents();
        setTabelTransaksi();
    }

//    Set Tabel
    public final void setTabelTransaksi() {

        String query
                = "SELECT id_transaksi, nama_lengkap, judul, tanggal_pinjam, tanggal_jatuh_tempo, tanggal_kembali, status_peminjaman, denda FROM transaksi "
                + "INNER JOIN anggota "
                + "ON transaksi.id_anggota = anggota.id_anggota "
                + "INNER JOIN buku "
                + "ON transaksi.id_buku = buku.id_buku ;";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jtable_custom1.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                 
                String tanggal_kembali = rs.getString("tanggal_kembali");
                String denda = rs.getString("denda");
                
                if(tanggal_kembali == null){
                    tanggal_kembali = "-";
                }
                
                if(denda.equals("0")){
                    denda = "-";   
                } else {
                    denda = "Rp. " + denda;
                }
                
                
                model.addRow(new Object[]{
                    rs.getString("id_transaksi"),
                    rs.getString("nama_lengkap"),
                    rs.getString("judul"),
                    rs.getString("tanggal_pinjam"),
                    rs.getString("tanggal_jatuh_tempo"),
                    tanggal_kembali,
                    rs.getString("status_peminjaman"),
                    denda,
                    "Ubah Status"
                });

                System.out.println();
            }

            dbc.putus();

        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Pengambilan data gagal");
        }
        
        
        // Event Listener untuk aktivkan kolom ubah status dan panggil method ubah status
        jtable_custom1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtable_custom1.getSelectedRow();
                int col = jtable_custom1.getSelectedColumn();

                // Kolom aksi (misal kolom ke-4)
                if (col == 8) {
                    String idPeminjaman = jtable_custom1.getValueAt(row, 0).toString();
                    try {
                        ubahStatus(idPeminjaman);
                    } catch (SQLException ex) {
                        System.out.println("Terjadi Kesalahan Update" + ex);
                    }
                }
            }
        });
    }

//    Method Ubah Status Peminjaman
    public void ubahStatus(String idTransaksi) throws SQLException {
        int totalDenda;

        // --- Ambil tanggal jatuh tempo ---
        String queryTJT = "SELECT tanggal_jatuh_tempo FROM transaksi WHERE id_transaksi = " + idTransaksi;
        ResultSet rs = dbc.crStmt().executeQuery(queryTJT);

        if (rs.next()) {
            String tjt = rs.getString("tanggal_jatuh_tempo");
            totalDenda = hitungDenda(LocalDate.parse(tjt));
        } else {
            System.out.println("Data tidak ditemukan id = " + idTransaksi);
            return;
        }

        int pilihan = JOptionPane.showConfirmDialog(
                jPanel1,
                "Total Denda: Rp " + totalDenda + "\nApakah Anda yakin ingin mengembalikan buku ini?",
                "Konfirmasi Pengembalian",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

// Jika pengguna menekan YA
        if (pilihan == JOptionPane.YES_OPTION) {
            
            String tanggalKembali = LocalDate.now().toString();

            // lakukan update status & denda
            String update = "UPDATE transaksi SET "
                    + "status_peminjaman = 'Di Kembalikan' ,"
                    + "tanggal_kembali = '" +  tanggalKembali + "' ,"
                    + "denda = " + totalDenda
                    + " WHERE id_transaksi = " + idTransaksi;

            dbc.crStmt().executeUpdate(update);
            
            setTabelTransaksi();

            JOptionPane.showMessageDialog(jPanel1, "Buku berhasil dikembalikan!\nTotal denda: Rp " + totalDenda);
            
            

        } else {
            JOptionPane.showMessageDialog(jPanel1, "Pengembalian dibatalkan.");
        }

        
    }

//    Method Hitung Denda
    public int hitungDenda(LocalDate tanggalJatuhTempo) {
        LocalDate hariIni = LocalDate.now();
        int dendaPerHari = 1000;

        if (hariIni.isAfter(tanggalJatuhTempo)) {
            long selisihHari = ChronoUnit.DAYS.between(tanggalJatuhTempo, hariIni);
            return (int) selisihHari * dendaPerHari;
        } else {
            return 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_custom1 = new components.jtable_custom();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblRiwayatPengembalian = new components.jtable_custom();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Peminjaman");

        jtable_custom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Peminjaman", "Nama Lengkap", "Judul Buku", "Tanggal Pinjam", "Jatuh Tempo", "Tanggal Kembali", "Status Peminjaman", "Denda", "Aksi"
            }
        ));
        jScrollPane2.setViewportView(jtable_custom1);

        jtblRiwayatPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Lengkap", "Judul Buku", "Tanggal Pinjam", "Jatuh Tempo", "Tanggal Kembali", "Denda"
            }
        ));
        jScrollPane3.setViewportView(jtblRiwayatPengembalian);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Riwayat Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private components.jtable_custom jtable_custom1;
    private components.jtable_custom jtblRiwayatPengembalian;
    // End of variables declaration//GEN-END:variables
}
