package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import controller.DbConn;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author evo
 */
public class Transaksi extends javax.swing.JPanel {

    // Koneksi Database dan array list untuk menyimpan data
    final DbConn dbc = new DbConn();
    ArrayList<String[]> dataPeminjaman = new ArrayList<>();
    ArrayList<String[]> dataRiwayatPengembalian = new ArrayList<>();

    public Transaksi() {
        initComponents();
        panggilMethod();
    }

    // Memanggil method
    public final void panggilMethod() {
        getDataPeminjaman();
        getDataRiwayatPengembalian();
        setTabelTransaksi(dataPeminjaman);
        setTabelRiwayatPengembalian(dataRiwayatPengembalian);
        
        cariPeminjaman();
        cariRiwayatPengembalian();
    }

    // Mengembil data peminjaman
    public final void getDataPeminjaman() {
        String query
                = "SELECT id_transaksi, nama_lengkap, judul, tanggal_pinjam, tanggal_jatuh_tempo, status_peminjaman FROM transaksi "
                + "INNER JOIN anggota "
                + "ON transaksi.id_anggota = anggota.id_anggota "
                + "INNER JOIN buku "
                + "ON transaksi.id_buku = buku.id_buku ;";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                dataPeminjaman.add(new String[]{
                    rs.getString("id_transaksi"),
                    rs.getString("nama_lengkap"),
                    rs.getString("judul"),
                    rs.getString("tanggal_pinjam"),
                    rs.getString("tanggal_jatuh_tempo"),
                    rs.getString("status_peminjaman"),});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1, "errorrrrr: " + ex);
        }
    }

    // Mengambil data riwayat pengembalian
    public final void getDataRiwayatPengembalian() {
        String query
                = "SELECT nama_lengkap, judul, tanggal_pinjam, tanggal_jatuh_tempo, tanggal_kembali, denda FROM pengembalian "
                + "INNER JOIN transaksi "
                + "ON pengembalian.id_transaksi = transaksi.id_transaksi "
                + "INNER JOIN anggota "
                + "ON anggota.id_anggota = transaksi.id_anggota "
                + "INNER JOIN buku "
                + "ON buku.id_buku = transaksi.id_buku ;";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {

                String tanggal_kembali = rs.getString("tanggal_kembali");
                String denda = rs.getString("denda");

                if (tanggal_kembali == null) {
                    tanggal_kembali = "-";
                }

                if (denda.equals("0")) {
                    denda = "-";
                } else {
                    denda = "Rp. " + denda;
                }

                dataRiwayatPengembalian.add(new String[]{
                    rs.getString("nama_lengkap"),
                    rs.getString("judul"),
                    rs.getString("tanggal_pinjam"),
                    rs.getString("tanggal_jatuh_tempo"),
                    tanggal_kembali,
                    denda,});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1, "errorrrrr: " + ex);
        }
    }

    // Method Set tabel transaksi
    public final void setTabelTransaksi(ArrayList<String[]> dataPeminjaman) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jtblPeminjaman.getModel();

        model.setRowCount(0);

        for (int i = 0; i < dataPeminjaman.size(); i++) {
            model.addRow(new Object[]{
                dataPeminjaman.get(i)[0],
                dataPeminjaman.get(i)[1],
                dataPeminjaman.get(i)[2],
                dataPeminjaman.get(i)[3],
                dataPeminjaman.get(i)[4],
                dataPeminjaman.get(i)[5],
                "Ubah Status"
            });
        }

        // Aktifkan kolom ubah status
        jtblPeminjaman.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jtblPeminjaman.getSelectedRow();
                int col = jtblPeminjaman.getSelectedColumn();

                // Kolom aksi
                if (col == 6) {
                    String idTransaksi = jtblPeminjaman.getValueAt(row, 0).toString();
                    try {
                        ubahStatus(idTransaksi);
                    } catch (SQLException ex) {
                        System.out.println("Terjadi Kesalahan Update" + ex);
                    }
                }
            }
        });
    }

    // Method set tabel riwayat pengembalian
    public final void setTabelRiwayatPengembalian(ArrayList<String[]> dataRiwayatPengembalian) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jtblRiwayatPengembalian.getModel();

        model.setRowCount(0);

        for (int i = 0; i < dataRiwayatPengembalian.size(); i++) {
            model.addRow(new Object[]{
                dataRiwayatPengembalian.get(i)[0],
                dataRiwayatPengembalian.get(i)[1],
                dataRiwayatPengembalian.get(i)[2],
                dataRiwayatPengembalian.get(i)[3],
                dataRiwayatPengembalian.get(i)[4],
                dataRiwayatPengembalian.get(i)[5],});
        }

    }

    // Method cari data peminjaman
    public final void cariPeminjaman() {
        jtxtPeminjaman.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {

                    System.out.println("Enter");
                    String keyword = jtxtPeminjaman.getText();

                    ArrayList<String[]> listPencarianSaatIni = new ArrayList<>();

                    if (adalahAngka(keyword)) {
                        for (int i = 0; i < dataPeminjaman.size(); i++) {

                            if (dataPeminjaman.get(i)[0].toLowerCase().contains(keyword)) {

                                listPencarianSaatIni.add(new String[]{
                                    dataPeminjaman.get(i)[0],
                                    dataPeminjaman.get(i)[1],
                                    dataPeminjaman.get(i)[2],
                                    dataPeminjaman.get(i)[3],
                                    dataPeminjaman.get(i)[4],
                                    dataPeminjaman.get(i)[5],});
                            }
                        }
                    } else {
                        for (int i = 0; i < dataPeminjaman.size(); i++) {

                            if (dataPeminjaman.get(i)[1].toLowerCase().contains(keyword)) {

                                listPencarianSaatIni.add(new String[]{
                                    dataPeminjaman.get(i)[0],
                                    dataPeminjaman.get(i)[1],
                                    dataPeminjaman.get(i)[2],
                                    dataPeminjaman.get(i)[3],
                                    dataPeminjaman.get(i)[4],
                                    dataPeminjaman.get(i)[5],});
                            }
                        }
                    }

                    setTabelTransaksi(listPencarianSaatIni);
                }
            }
        });
    }

    // Method cari data riwayat peminjaman
    public final void cariRiwayatPengembalian() {
        jtxtRiwayatPengembalian.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {

                    System.out.println("Enter");
                    String keyword = jtxtRiwayatPengembalian.getText();

                    ArrayList<String[]> listPencarianSaatIni = new ArrayList<>();

                    for (int i = 0; i < dataRiwayatPengembalian.size(); i++) {

                        if (dataRiwayatPengembalian.get(i)[0].toLowerCase().contains(keyword)) {

                            listPencarianSaatIni.add(new String[]{
                                dataRiwayatPengembalian.get(i)[0],
                                dataRiwayatPengembalian.get(i)[1],
                                dataRiwayatPengembalian.get(i)[2],
                                dataRiwayatPengembalian.get(i)[3],
                                dataRiwayatPengembalian.get(i)[4],
                                dataRiwayatPengembalian.get(i)[5],});
                        }
                    }

                    setTabelRiwayatPengembalian(listPencarianSaatIni);
                }
            }
        });
    }

    // Method Ubah Status Peminjaman
    public void ubahStatus(String idTransaksi) throws SQLException {
        int totalDenda;

        // --- Ambil tanggal jatuh tempo ---
        String queryTJT = "SELECT status_peminjaman, tanggal_jatuh_tempo FROM transaksi WHERE id_transaksi = " + idTransaksi;
        ResultSet rs = dbc.crStmt().executeQuery(queryTJT);

        if (rs.next()) {

            if (rs.getString("status_peminjaman").equals("Di Kembalikan")) {
                JOptionPane.showMessageDialog(jPanel1, "Buku Sudah Di kembalikan");

                return;
            }

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

        // Simpan data pengembalian dan tampilkan pesan konfirmasi jika admin menekan ya
        if (pilihan == JOptionPane.YES_OPTION) {
            tambahPengembalian(idTransaksi, totalDenda);

            String queryUbahStatus = "UPDATE transaksi "
                    + "SET status_peminjaman = 'Di Kembalikan' "
                    + "WHERE id_transaksi = " + idTransaksi + ";";

            dbc.crStmt().executeUpdate(queryUbahStatus);
            dbc.putus();

            JOptionPane.showMessageDialog(jPanel1, "Buku berhasil dikembalikan!\nTotal denda: Rp " + totalDenda);

        } else {
            JOptionPane.showMessageDialog(jPanel1, "Pengembalian dibatalkan.");
        }

        panggilMethod();
    }

    // Method Tambah Pengembalian
    public void tambahPengembalian(String idTransaksi, int denda) {

        String tanggalKembali = LocalDate.now().toString();

        String query = "INSERT INTO pengembalian (id_transaksi, tanggal_kembali, denda) "
                + "VALUES (" + idTransaksi + " , '" + tanggalKembali + "', " + denda + ");";

        try {
            dbc.crStmt().executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("tambah pengembalian gagal " + ex);
        }
    }

    // Method Hitung Denda
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

    // Untuk Cek Keyword merupakan angka atau tidak
    public boolean adalahAngka(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPeminjaman = new components.jtable_custom();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblRiwayatPengembalian = new components.jtable_custom();
        jLabel3 = new javax.swing.JLabel();
        jtxtPeminjaman = new components.FieldPencarian();
        jtxtRiwayatPengembalian = new components.FieldPencarian();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-borrow-book-24(1).png"))); // NOI18N
        jLabel2.setText("Peminjaman");

        jtblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Peminjaman", "Nama Lengkap", "Judul Buku", "Tanggal Pinjam", "Jatuh Tempo", "Status Peminjaman", "Aksi"
            }
        ));
        jScrollPane2.setViewportView(jtblPeminjaman);

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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-history-24 (1).png"))); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtRiwayatPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtRiwayatPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
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
            .addGap(0, 996, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private components.jtable_custom jtblPeminjaman;
    private components.jtable_custom jtblRiwayatPengembalian;
    private components.FieldPencarian jtxtPeminjaman;
    private components.FieldPencarian jtxtRiwayatPengembalian;
    // End of variables declaration//GEN-END:variables
}
