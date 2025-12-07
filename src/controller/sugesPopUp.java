package controller;

import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class sugesPopUp {
    
    javax.swing.JTextField jTextField;
    ArrayList<String> listData;

// --- popup untuk sugesti (inisialisasi sekali saja) ---
    JPopupMenu suggestPopup = new JPopupMenu();
    JList<String> suggestList = new JList<>();
    JScrollPane suggestScroll = new JScrollPane(suggestList);

    public sugesPopUp(javax.swing.JTextField jTextField, ArrayList<String> listData) {

        this.jTextField = jTextField;
        this.listData = listData;


// ukuran minimal agar terlihat rapi
        suggestScroll.setPreferredSize(new Dimension(this.jTextField.getWidth(), 120));
        suggestPopup.setFocusable(false);      // jangan ambil fokus
        suggestList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        suggestPopup.add(suggestScroll);

    }

    public void active() {

// --- dokument listener untuk live search ---
        this.jTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                cekInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                cekInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }

            private void cekInput() {
                String input = jTextField.getText().toLowerCase().trim();

                if (input.isEmpty()) {
                    suggestPopup.setVisible(false);
                    return;
                }

                DefaultListModel<String> model = new DefaultListModel<>();
                for (String data : listData) {
                    String nama = data;
                    if (nama != null && nama.toLowerCase().contains(input)) {
                        model.addElement(nama);
                    }
                }

                if (model.isEmpty()) {
                    suggestPopup.setVisible(false);
                    return;
                }

                suggestList.setModel(model);

                // atur ukuran popup agar tidak terlalu kecil/terlalu besar
                suggestScroll.setPreferredSize(new Dimension(jTextField.getWidth(), Math.min(120, model.getSize() * 20 + 4)));
                suggestPopup.pack();

                // tampilkan popup tepat di bawah textfield
                suggestPopup.show(jTextField, 0, jTextField.getHeight());

                // pastikan focus tetap di textfield agar user tetap bisa mengetik/hapus
                jTextField.requestFocusInWindow();
            }
        });

// --- klik pada suggestion untuk memilih ---
        suggestList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    String selected = suggestList.getSelectedValue();
                    if (selected != null) {
                        jTextField.setText(selected);
                    }
                    suggestPopup.setVisible(false);
                    jTextField.requestFocusInWindow();
                }
            }
        });

// --- keyboard: pindah ke suggestion dengan DOWN, lalu navigasi dan pilih dengan ENTER ---
        this.jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN && suggestPopup.isVisible()) {
                    // pindah fokus ke list dan pilih item pertama
                    if (suggestList.getModel().getSize() > 0) {
                        suggestList.requestFocusInWindow();
                        suggestList.setSelectedIndex(0);
                    }
                }
            }
        });

        suggestList.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    String selected = suggestList.getSelectedValue();
                    if (selected != null) {
                        jTextField.setText(selected);
                    }
                    suggestPopup.setVisible(false);
                    jTextField.requestFocusInWindow();
                } else if (code == KeyEvent.VK_ESCAPE) {
                    // tutup popup dan kembalikan fokus
                    suggestPopup.setVisible(false);
                    jTextField.requestFocusInWindow();
                } else if (code == KeyEvent.VK_UP && suggestList.getSelectedIndex() == 0) {
                    // jika sudah di atas dan user tekan UP, kembalikan fokus ke textfield
                    jTextField.requestFocusInWindow();
                }
            }
        });

// --- jika user klik di area lain, tutup popup ---
        this.jTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // beri delay kecil agar click pada list masih terproses
                SwingUtilities.invokeLater(() -> {
                    if (!suggestList.hasFocus()) {
                        suggestPopup.setVisible(false);
                    }
                });
            }
        });
        
    }
}
