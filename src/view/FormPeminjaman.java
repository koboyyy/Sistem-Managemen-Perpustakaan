package view;

import components.SugesPopUp;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import controller.DbConn;

public class FormPeminjaman extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPeminjaman.class.getName());

    ArrayList<String[]> listBuku = new ArrayList<>();
    ArrayList<String[]> listAnggota = new ArrayList<>();

    final DbConn dbc = new DbConn();
    
    final SugesPopUp spu1;
    final SugesPopUp spu2;

    public FormPeminjaman() {
        initComponents();
        this.listBuku = getDataBuku();
        this.listAnggota = getDataAnggota();

//        tfBuku
        ArrayList<javax.swing.JTextField> listTj1 = new ArrayList<>();
        
//        tfAnggota
        ArrayList<javax.swing.JTextField> listTj3 = new ArrayList<>();
        
        listTj1.add(jtIdBuku1);
        listTj1.add(jtPengarangBuku1);
        listTj1.add(jtPenerbitBuku1);
        listTj1.add(jtTahunTerbitBuku1);      
        
        listTj3.add(tfIDAnggota);

        this.setLocationRelativeTo(null);

        this.spu1 = new SugesPopUp(jtNamaAnggota, new ArrayList<>(), listAnggota);
        spu1.active();
        spu1.isiAnakan(true, listTj3);       
        
        this.spu2 = new SugesPopUp(jtJudulBuku1, new ArrayList<>(), listBuku);
        spu2.active();
        spu2.isiAnakan(true, listTj1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        judulForm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfIDAnggota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNamaAnggota = new javax.swing.JTextField();
        jdTanggalPinjam = new com.toedter.calendar.JDateChooser();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jpBukuPertama = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtJudulBuku1 = new javax.swing.JTextField();
        jtPengarangBuku1 = new javax.swing.JTextField();
        jtPenerbitBuku1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtTahunTerbitBuku1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtIdBuku1 = new javax.swing.JTextField();

        jLabel20.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel20.setText("Judul Buku");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulir Peminjaman");

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 255));
        kGradientPanel1.setLayout(new java.awt.BorderLayout(0, 10));

        judulForm.setBackground(new java.awt.Color(0, 0, 0));
        judulForm.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        judulForm.setForeground(new java.awt.Color(255, 255, 255));
        judulForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulForm.setText("Formulir Peminjaman");
        judulForm.setPreferredSize(new java.awt.Dimension(223, 40));
        kGradientPanel1.add(judulForm, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 572));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("ID Anggota :");

        tfIDAnggota.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        tfIDAnggota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Nama Anggota :");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Pinjam :");

        jtNamaAnggota.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jtNamaAnggota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jdTanggalPinjam.setBackground(new java.awt.Color(255, 255, 255));
        jdTanggalPinjam.setForeground(new java.awt.Color(255, 255, 255));
        jdTanggalPinjam.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N

        btnSimpan.setBackground(new java.awt.Color(0, 102, 255));
        btnSimpan.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(0, 102, 255));
        btnBatal.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jpBukuPertama.setBackground(new java.awt.Color(255, 255, 255));
        jpBukuPertama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Detail Buku", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 0, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel11.setText("Judul Buku");

        jtJudulBuku1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtJudulBuku1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jtPengarangBuku1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtPengarangBuku1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jtPenerbitBuku1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtPenerbitBuku1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel12.setText("Pengarang");

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel14.setText("Penerbit ");

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel15.setText("Tahun Terbit");

        jtTahunTerbitBuku1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtTahunTerbitBuku1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel19.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel19.setText("Id Buku");

        jtIdBuku1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jpBukuPertamaLayout = new javax.swing.GroupLayout(jpBukuPertama);
        jpBukuPertama.setLayout(jpBukuPertamaLayout);
        jpBukuPertamaLayout.setHorizontalGroup(
            jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                        .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPenerbitBuku1)
                            .addComponent(jtTahunTerbitBuku1)
                            .addComponent(jtPengarangBuku1)
                            .addComponent(jtIdBuku1)
                            .addComponent(jtJudulBuku1)
                            .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                                .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11))
                                .addGap(0, 508, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
        );
        jpBukuPertamaLayout.setVerticalGroup(
            jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtJudulBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtIdBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPengarangBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPenerbitBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTahunTerbitBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jpBukuPertama);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btnBatal))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        tambahPeminjaman();
        resetField();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    public void resetField() {
        tfIDAnggota.setText("");
        jtIdBuku1.setText("");
        jdTanggalPinjam.setCalendar(null);
        jtJudulBuku1.setText("");
        jtNamaAnggota.setText("");
        jtPenerbitBuku1.setText("");
        jtTahunTerbitBuku1.setText("");
        jtPengarangBuku1.setText("");
    }
    
    public void tambahPeminjaman() {

//        varaibel variable
        String idAnggota = tfIDAnggota.getText();
        String id_buku = jtIdBuku1.getText();
        Date tglPinjam = jdTanggalPinjam.getDate(); 
        Calendar cal = Calendar.getInstance();
        cal.setTime(tglPinjam);

        cal.add(Calendar.DAY_OF_MONTH, 7);
        Date jatuhTempo = cal.getTime();

        java.sql.Date tanggalJatuhTempo = new java.sql.Date(jatuhTempo.getTime());
        java.sql.Date tanggalPinjam = new java.sql.Date(tglPinjam.getTime());

        System.out.println(tanggalJatuhTempo);

//      Querry database
        String query1
                = "INSERT INTO transaksi (id_anggota, id_buku, tanggal_pinjam, tanggal_jatuh_tempo, status_peminjaman) VALUES ("
                + "'" + idAnggota + "', "
                + "'" + id_buku + "', "
                + "'" + tanggalPinjam + "', "
                + "'" + tanggalJatuhTempo +"', 'Di Pinjam');";

        try {
            
//            Execute update
            dbc.crStmt().executeUpdate(query1);

            JOptionPane.showMessageDialog(null, "Peminjaman berhasil disimpan!");

            dbc.putus();

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error menyimpan peminjaman!");
        }

    }

    public final ArrayList<String[]> getDataBuku() {

        ArrayList<String[]> data = new ArrayList<>();

        String query = "SELECT judul, id_buku, nama_pengarang, nama_penerbit, "
                + "tahun_terbit, eksemplar, sumber, tanggal_terima "
                + "FROM buku "
                + "INNER JOIN pengarang ON pengarang.id_pengarang = buku.id_pengarang "
                + "INNER JOIN penerbit ON penerbit.id_penerbit = buku.id_penerbit ";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                data.add(new String[]{
                    rs.getString("judul"),
                    rs.getString("id_buku"),
                    rs.getString("nama_pengarang"),
                    rs.getString("nama_penerbit"),
                    rs.getString("tahun_terbit")
                });
            }
            
            dbc.putus();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return data;

    }

    public final ArrayList<String[]> getDataAnggota() {
        
        ArrayList<String[]> data = new ArrayList<>();
        
        String query = "SELECT id_anggota, nama_lengkap, tempat_lahir, tanggal_lahir, nik, alamat, jenis_kelamin, no_hp FROM anggota";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                data.add(new String[]{
                    rs.getString("nama_lengkap"),
                    rs.getString("id_anggota"),
                    rs.getString("tempat_lahir"),
                    rs.getString("tanggal_lahir")
                    
                });
            }
            
            for(int i = 0; i < data.size() ; i++){
                System.out.println(data.get(i)[0]);
            }

            dbc.putus();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return data;
    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPeminjaman().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdTanggalPinjam;
    private javax.swing.JPanel jpBukuPertama;
    private javax.swing.JTextField jtIdBuku1;
    private javax.swing.JTextField jtJudulBuku1;
    private javax.swing.JTextField jtNamaAnggota;
    private javax.swing.JTextField jtPenerbitBuku1;
    private javax.swing.JTextField jtPengarangBuku1;
    private javax.swing.JTextField jtTahunTerbitBuku1;
    private javax.swing.JLabel judulForm;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField tfIDAnggota;
    // End of variables declaration//GEN-END:variables
}
