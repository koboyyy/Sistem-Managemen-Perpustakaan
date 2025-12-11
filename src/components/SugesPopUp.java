package components;

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

public class SugesPopUp {

    private final javax.swing.JTextField jTextField;
    private boolean isiAnakan = false;
    
    private ArrayList<String> listData = new ArrayList<>();
    private ArrayList<String[]> listDataArray = new ArrayList<>();
    private ArrayList<javax.swing.JTextField> listJt = new ArrayList<>();

    JPopupMenu suggestPopup = new JPopupMenu();
    JList<String> suggestList = new JList<>();
    JScrollPane suggestScroll = new JScrollPane(suggestList);

    public SugesPopUp(javax.swing.JTextField jTextField, ArrayList<String> listData) {

        this.jTextField = jTextField;
        this.listData = listData;
        setinganUI();

    }

    public SugesPopUp(javax.swing.JTextField jTextField, ArrayList<String> listData, ArrayList<String[]> listDataArray) {

        this.jTextField = jTextField;
        this.listData = listData;
        this.listDataArray = listDataArray;
        setinganUI();

    }

    public final void setinganUI() {

        suggestScroll.setPreferredSize(new Dimension(this.jTextField.getWidth(), 120));
        suggestPopup.setFocusable(false);
        suggestList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        suggestPopup.add(suggestScroll);
    }

    public void isiAnakan(boolean b, ArrayList<javax.swing.JTextField> listJt) {
        this.isiAnakan = b;
        this.listJt = listJt;
    }

    public void active() {

// ---  dokument listener untuk live search ---
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
                cekInput();
            }

            private void cekInput() {
                String input = jTextField.getText().toLowerCase().trim();
                
//                Jika kosong sembunyikan suggestPopup
                if (input.isEmpty()) {
                    suggestPopup.setVisible(false);
                    return;
                }

//                Bikin Model List Default
                DefaultListModel<String> model = new DefaultListModel<>();

//                Jika list data tidak kosong tambahkan seluruh isi list data ke dalam model list
                if (!listData.isEmpty()) {

                    for (String data : listData) {
                        String nama = data;
                        if (nama != null && nama.toLowerCase().contains(input)) {
                            model.addElement(nama);
                        }
                    }
                    
//                    Jika list data kosong maka tambahkan isi list data array kedalam model list
                } else {

                    for (String[] dataArray : listDataArray) {
                        if (dataArray[0] != null && dataArray[0].toLowerCase().contains(input)) {
                            model.addElement(dataArray[0]);
                        }

                    }

                }
                
                
//              Jika model list kosong maka sembunyikan pop up dan berhentikan fungsi
                if (model.isEmpty()) {
                    suggestPopup.setVisible(false);
                    return;
                }

//                Masukkan model list kedalam suggestList
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
        
// ---  klik pada suggestion untuk memilih ---
        suggestList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    String selected = suggestList.getSelectedValue();
                    
//                    Jika isiAnakan true maka jalankan auto complit
                    if (isiAnakan) {

                        if (selected != null) {
                            jTextField.setText(selected);
                        }

                        jTextField.setText(selected);

                        // Cari data yang cocok
                        for (String[] dataArray : listDataArray) {

                            // Gunakan equals untuk membandingkan String
                            if (dataArray[0].equals(selected)) {

                                // Isi setiap JTextField secara dinamis
                                for (int i = 0; i < listJt.size(); i++) {

                                    // i+1 karena dataArray[0] = key
                                    if (i + 1 < dataArray.length) {
                                        listJt.get(i).setText(dataArray[i + 1]);
                                    } else {
                                        // Jika dataArray kurang panjang, isi string kosong
                                        listJt.get(i).setText("");
                                    }
                                }

                                break; // Hentikan loop setelah ketemu
                            }
                        }
                        
//                        Jika isiAnakan false text field dengan saran yang di seleksi
                    } else {
                        if (selected != null) {
                            jTextField.setText(selected);
                        }
                    }

//                    sembunyikan suggesPopup
                    suggestPopup.setVisible(false);
                    
//                    Fokus kembali ke text field
                    jTextField.requestFocusInWindow();
                }
            }
        });

// ---  keyboard: pindah ke suggestion dengan DOWN, lalu navigasi dan pilih dengan ENTER ---
        this.jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN && suggestPopup.isVisible()) {
                    // pindah fokus ke list dan pilih item pertama
                    
                    System.out.println("size model: " + suggestList.getModel().getSize());
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

                    if (isiAnakan) {

                        if (selected != null) {
                            jTextField.setText(selected);
                        }

                        jTextField.setText(selected);

                        // Cari data yang cocok
                        for (String[] dataArray : listDataArray) {

                            // Gunakan equals untuk membandingkan String
                            if (dataArray[0].equals(selected)) {

                                // Isi setiap JTextField secara dinamis
                                for (int i = 0; i < listJt.size(); i++) {

                                    // i+1 karena dataArray[0] = key
                                    if (i + 1 < dataArray.length) {
                                        listJt.get(i).setText(dataArray[i + 1]);
                                    } else {
                                        // Jika dataArray kurang panjang, isi string kosong
                                        listJt.get(i).setText("");
                                    }
                                }

                                break; // Hentikan loop setelah ketemu
                            }
                        }
                    } else {
                        if (selected != null) {
                            jTextField.setText(selected);
                        }
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

// ---  jika user klik di area lain, tutup popup ---
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
