package App;

import controller.DbConn;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {

    DbConn dbc = new DbConn();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        initCostumeComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfkatasandi = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(1465, 900));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel5.setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Nama:");

        jtfnama.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Kata Sandi :");

        jtfkatasandi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jtfkatasandi.setMargin(new java.awt.Insets(6, 6, 2, 6));

        jCheckBox1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jCheckBox1.setText("Ingat Saya");

        jbtnLogin.setBackground(new java.awt.Color(0, 102, 255));
        jbtnLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogin.setText("Masuk");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfkatasandi)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(0, 282, Short.MAX_VALUE))
                    .addComponent(jtfnama))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfkatasandi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 282;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 110, 376, 139);
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(288, 301, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel5.add(jPanel1);

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/Books_2_40672 (2).png"))); // NOI18N
        jPanel6.add(jLabel4, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel6);

        getContentPane().add(jPanel5, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed

        String username = jtfnama.getText();
        String password = jtfkatasandi.getText();

        if (validasiLogin(username, password)) {
            new App().setVisible(true);
            dispose();
            System.out.println("Login Berhasil");
        } else {
            System.out.println("Login Gagal");
        }
    }//GEN-LAST:event_jbtnLoginActionPerformed

    public boolean validasiLogin(String username, String password) {
        String query = "SELECT * FROM admin WHERE username = '" + username + "' AND password = '" + password + "';";

        try {
            ResultSet rs = dbc.crStmt().executeQuery(query);
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public final void initCostumeComponents() {

//        Border text field;
        Border padding = BorderFactory.createEmptyBorder(0, 8, 0, 8);

        Color abuabu = new Color(204, 204, 204);

        Border borderLine = BorderFactory.createLineBorder(abuabu, 1, true);

        Border compoundBorder = BorderFactory.createCompoundBorder(borderLine, padding);

        jtfnama.setBorder(compoundBorder);
        jtfkatasandi.setBorder(compoundBorder);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JTextField jtfkatasandi;
    private javax.swing.JTextField jtfnama;
    // End of variables declaration//GEN-END:variables
}
