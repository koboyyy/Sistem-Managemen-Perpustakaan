package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.DbConn;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author evo
 */
public class DataAnggota extends javax.swing.JPanel {

    final DbConn dbc = new DbConn();
    ArrayList<String[]> dataAnggota = new ArrayList<>();

    public DataAnggota() {
        initComponents();
        getDataAnggota();
        showDataAnggota(dataAnggota);
        cariAnggota();
    }

    public final void getDataAnggota() {
        String query = "SELECT nama_lengkap, tempat_lahir, tanggal_lahir, nik, alamat, jenis_kelamin, no_hp, email FROM anggota";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);

            while (rs.next()) {
                dataAnggota.add(new String[]{
                    rs.getString("nama_lengkap"),
                    rs.getString("tempat_lahir"),
                    rs.getString("tanggal_lahir"),
                    rs.getString("nik"),
                    rs.getString("alamat"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_hp"),
                    rs.getString("email"),});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPanel1, "errorrrrr: " + ex);
        }
    }

    public final void showDataAnggota(ArrayList<String[]> dataAnggota) {
        javax.swing.table.DefaultTableModel modelTabel
                = (javax.swing.table.DefaultTableModel) jtblAnggota.getModel();

        modelTabel.setRowCount(0);

        for (int i = 0; i < dataAnggota.size(); i++) {

            System.out.println(dataAnggota.get(i)[0]);

            modelTabel.addRow(new Object[]{
                dataAnggota.get(i)[0],
                dataAnggota.get(i)[1],
                dataAnggota.get(i)[2],
                dataAnggota.get(i)[3],
                dataAnggota.get(i)[4],
                dataAnggota.get(i)[5],
                dataAnggota.get(i)[6],
                dataAnggota.get(i)[7],});
        }
    }

    public final void cariAnggota() {

        jtxtPencarianAnggota.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    String keyword = jtxtPencarianAnggota.getText();
                    
                    ArrayList<String[]> listAnggota = new ArrayList<>();

                    for (int i = 0; i < dataAnggota.size(); i++) {
                        if (dataAnggota.get(i)[0].toLowerCase().contains(keyword)) {

                            listAnggota.add(new String[]{
                                dataAnggota.get(i)[0],
                                dataAnggota.get(i)[1],
                                dataAnggota.get(i)[2],
                                dataAnggota.get(i)[3],
                                dataAnggota.get(i)[4],
                                dataAnggota.get(i)[5],
                                dataAnggota.get(i)[6],
                                dataAnggota.get(i)[7]
                            });

                        }
                    }

                    showDataAnggota(listAnggota);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblAnggota = new components.jtable_custom();
        jtxtPencarianAnggota = new components.FieldPencarian();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tambah Anggota");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8-member-24 (1).png"))); // NOI18N
        jLabel2.setText("Data Anggota");

        jtblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Lengkap", "Tempat Lahir", "Tanggal Lahir", "NIK", "Alamat", "Jenis Kelamin", "Nomor HP", "Email"
            }
        ));
        jScrollPane2.setViewportView(jtblAnggota);

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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtPencarianAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPencarianAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FormPendaftaranAnggota().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private components.jtable_custom jtblAnggota;
    private components.FieldPencarian jtxtPencarianAnggota;
    // End of variables declaration//GEN-END:variables
}
