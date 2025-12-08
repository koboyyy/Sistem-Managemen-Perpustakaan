package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.DbConn;

/**
 *
 * @author evo
 */
public class DataBuku extends javax.swing.JPanel {
    
    final DbConn dbc = new DbConn();
    
    public DataBuku() {
        initComponents();
        showDataBuku();
    }

    public final void showDataBuku() {
       
        String query = "SELECT b.judul, p.nama_pengarang, pn.nama_penerbit, "
                + "b.tahun_terbit, b.eksemplar, b.sumber, b.tanggal_terima "
                + "FROM buku b "
                + "LEFT JOIN pengarang p ON b.id_pengarang = p.id_pengarang "
                + "LEFT JOIN penerbit pn ON b.id_penerbit = pn.id_penerbit ";


        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            javax.swing.table.DefaultTableModel modelTabel
                    = (javax.swing.table.DefaultTableModel) jtblBuku.getModel();

            modelTabel.setRowCount(0);

            while (rs.next()) {
                modelTabel.addRow(new Object[]{
                    rs.getString("judul"),
                    rs.getString("nama_pengarang"),
                    rs.getString("nama_penerbit"),
                    rs.getString("tahun_terbit"),
                    rs.getInt("eksemplar"),
                    rs.getString("sumber"),
                    rs.getString("tanggal_terima")
                });
            }

            dbc.putus();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbTambahBuku = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblBuku = new components.jtable_custom();
        jbTambahPengarang = new javax.swing.JButton();
        jbTambahPenerbit = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbTambahBuku.setBackground(new java.awt.Color(0, 102, 255));
        jbTambahBuku.setForeground(new java.awt.Color(255, 255, 255));
        jbTambahBuku.setText("Tambah Buku");
        jbTambahBuku.addActionListener(this::jbTambahBukuActionPerformed);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-book-24 (1).png"))); // NOI18N
        jLabel2.setText("Koleksi Buku");

        jtblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "Pengarang", "Penerbit", "Tahun Terbit", "Eksemplar", "Sumber", "Tanggal Terima", "Aksi"
            }
        ));
        jScrollPane2.setViewportView(jtblBuku);

        jbTambahPengarang.setBackground(new java.awt.Color(0, 102, 255));
        jbTambahPengarang.setForeground(new java.awt.Color(255, 255, 255));
        jbTambahPengarang.setText("Tambah Pengarang");
        jbTambahPengarang.addActionListener(this::jbTambahPengarangActionPerformed);

        jbTambahPenerbit.setBackground(new java.awt.Color(0, 102, 255));
        jbTambahPenerbit.setForeground(new java.awt.Color(255, 255, 255));
        jbTambahPenerbit.setText("Tambah Penerbit");
        jbTambahPenerbit.addActionListener(this::jbTambahPenerbitActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbTambahPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbTambahPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbTambahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTambahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTambahPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTambahPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbTambahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahBukuActionPerformed
        new FormTambahBuku().setVisible(true);
    }//GEN-LAST:event_jbTambahBukuActionPerformed

    private void jbTambahPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahPengarangActionPerformed
        new FormTambahPengarang().setVisible(true);
    }//GEN-LAST:event_jbTambahPengarangActionPerformed

    private void jbTambahPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTambahPenerbitActionPerformed
        new FormTambahPenerbit().setVisible(true);
    }//GEN-LAST:event_jbTambahPenerbitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbTambahBuku;
    private javax.swing.JButton jbTambahPenerbit;
    private javax.swing.JButton jbTambahPengarang;
    private components.jtable_custom jtblBuku;
    // End of variables declaration//GEN-END:variables
}
