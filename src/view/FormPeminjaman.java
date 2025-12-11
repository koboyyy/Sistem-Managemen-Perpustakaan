package view;

import components.SugesPopUp;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import model.DbConn;

public class FormPeminjaman extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPeminjaman.class.getName());

    ArrayList<String[]> listBuku = new ArrayList<>();
    ArrayList<String[]> listAnggota = new ArrayList<>();

    
    final DbConn dbc;
    final SugesPopUp spu1;
    final SugesPopUp spu2;
    
    final SugesPopUp spu3;

    public FormPeminjaman() {
        initComponents();
        this.dbc = new DbConn();
        this.listBuku = getDataBuku();
        this.listAnggota = getDataAnggota();

//        tfBuku
        ArrayList<javax.swing.JTextField> listTj1 = new ArrayList<>();
        ArrayList<javax.swing.JTextField> listTj2 = new ArrayList<>();
        
//        tfAnggota
        ArrayList<javax.swing.JTextField> listTj3 = new ArrayList<>();
        
        listTj1.add(jtIdBuku1);
        listTj1.add(jtPengarangBuku1);
        listTj1.add(jtPenerbitBuku1);
        listTj1.add(jtTahunTerbitBuku1);

        listTj2.add(jtIdBuku2);
        listTj2.add(jtPengarangBuku2);
        listTj2.add(jtPenerbitBuku2);
        listTj2.add(jtTahunTerbitBuku2);
        
        
        listTj3.add(tfIDAnggota);

        this.setLocationRelativeTo(null);

        this.spu1 = new SugesPopUp(jtNamaAnggota, new ArrayList<>(), listAnggota);
        spu1.active();
        spu1.isiAnakan(true, listTj3);

        this.spu2 = new SugesPopUp(jtJudulBuku2, new ArrayList<>(), listBuku);
        spu2.active();
        spu2.isiAnakan(true, listTj2);
        
        
        this.spu3 = new SugesPopUp(jtJudulBuku1, new ArrayList<>(), listBuku);
        spu3.active();
        spu3.isiAnakan(true, listTj1);
        
        
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
        jpBukuKedua = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jtJudulBuku2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtPengarangBuku2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtPenerbitBuku2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtTahunTerbitBuku2 = new javax.swing.JTextField();
        jtIdBuku2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

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
        jpBukuPertama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Detail Buku Pertama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 0, 14))); // NOI18N

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
                        .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPenerbitBuku1)
                            .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                                .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(0, 202, Short.MAX_VALUE))
                            .addComponent(jtTahunTerbitBuku1)
                            .addComponent(jtPengarangBuku1))
                        .addGap(14, 14, 14))
                    .addGroup(jpBukuPertamaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBukuPertamaLayout.createSequentialGroup()
                        .addGroup(jpBukuPertamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtIdBuku1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtJudulBuku1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpBukuPertamaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 209, Short.MAX_VALUE)))
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

        jpBukuKedua.setBackground(new java.awt.Color(255, 255, 255));
        jpBukuKedua.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Detail Buku Kedua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 0, 14))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel13.setText("Judul Buku");

        jtJudulBuku2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtJudulBuku2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel16.setText("Pengarang");

        jtPengarangBuku2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtPengarangBuku2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel17.setText("Penerbit ");

        jtPenerbitBuku2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtPenerbitBuku2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel18.setText("Tahun Terbit");

        jtTahunTerbitBuku2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jtTahunTerbitBuku2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jtIdBuku2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel21.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel21.setText("Id Buku");

        javax.swing.GroupLayout jpBukuKeduaLayout = new javax.swing.GroupLayout(jpBukuKedua);
        jpBukuKedua.setLayout(jpBukuKeduaLayout);
        jpBukuKeduaLayout.setHorizontalGroup(
            jpBukuKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBukuKeduaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpBukuKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtIdBuku2)
                    .addComponent(jtTahunTerbitBuku2)
                    .addComponent(jtPengarangBuku2)
                    .addComponent(jtPenerbitBuku2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtJudulBuku2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpBukuKeduaLayout.createSequentialGroup()
                        .addGroup(jpBukuKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jpBukuKeduaLayout.setVerticalGroup(
            jpBukuKeduaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBukuKeduaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtJudulBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtIdBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPengarangBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPenerbitBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTahunTerbitBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jpBukuKedua);

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
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    public void tambahPeminjaman() {

//        AMBIL INPUT FORM
        String idAnggota = tfIDAnggota.getText();
        String id_buku = jtIdBuku1.getText();
        Date tglPinjam = jdTanggalPinjam.getDate(); 
        Calendar cal = Calendar.getInstance();
        cal.setTime(tglPinjam);

// Tambahkan 7 hari
        cal.add(Calendar.DAY_OF_MONTH, 7);
        Date jatuhTempo = cal.getTime();

        java.sql.Date tanggalJatuhTempo = new java.sql.Date(jatuhTempo.getTime());
        java.sql.Date tanggalPinjam = new java.sql.Date(tglPinjam.getTime());

        System.out.println(tanggalJatuhTempo);


        // =============================
        // SUSUN QUERY INSERT PEMINJAMAN
        // =============================
        String query1
                = "INSERT INTO peminjaman (id_anggota, id_buku, tanggal_pinjam, tanggal_jatuh_tempo) VALUES ("
                + "'" + idAnggota + "', "
                + "'" + id_buku + "', "
                + "'" + tanggalPinjam + "', "
                + "'" + tanggalJatuhTempo + "'"
                + ");";

        try {
            // EXECUTE QUERY
            dbc.crStmt().executeUpdate(query1); // simpan peminjaman

            System.out.println("Insert peminjaman complete.");
            JOptionPane.showMessageDialog(null, "Peminjaman berhasil disimpan!");

            dbc.putus();

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error menyimpan peminjaman!");
        }

    }

    public final ArrayList<String[]> getDataBuku() {

        ArrayList<String[]> data = new ArrayList<>();

//        ASUMSIKAN JUDUL BUKU TIDAK DUPLIKAT
        String query = "SELECT  b.judul, b.id_buku, p.nama_pengarang, pn.nama_penerbit, "
                + "b.tahun_terbit, b.eksemplar, b.sumber, b.tanggal_terima "
                + "FROM buku b "
                + "LEFT JOIN pengarang p ON b.id_pengarang = p.id_pengarang "
                + "LEFT JOIN penerbit pn ON b.id_penerbit = pn.id_penerbit ";

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
            
            for(int i = 0; i < data.size() ; i++){
                System.out.println(data.get(i)[0]);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdTanggalPinjam;
    private javax.swing.JPanel jpBukuKedua;
    private javax.swing.JPanel jpBukuPertama;
    private javax.swing.JTextField jtIdBuku1;
    private javax.swing.JTextField jtIdBuku2;
    private javax.swing.JTextField jtJudulBuku1;
    private javax.swing.JTextField jtJudulBuku2;
    private javax.swing.JTextField jtNamaAnggota;
    private javax.swing.JTextField jtPenerbitBuku1;
    private javax.swing.JTextField jtPenerbitBuku2;
    private javax.swing.JTextField jtPengarangBuku1;
    private javax.swing.JTextField jtPengarangBuku2;
    private javax.swing.JTextField jtTahunTerbitBuku1;
    private javax.swing.JTextField jtTahunTerbitBuku2;
    private javax.swing.JLabel judulForm;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField tfIDAnggota;
    // End of variables declaration//GEN-END:variables
}
