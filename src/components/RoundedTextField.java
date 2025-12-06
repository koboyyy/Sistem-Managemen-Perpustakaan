package components;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder; // Untuk menghapus border bawaan
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class RoundedTextField extends JTextField {
    private Shape shape;
    private final int arcSize = 15; // Jari-jari untuk sudut membulat

    public RoundedTextField(int size) {
        super(size);
        // 🛑 PENTING 1: Nonaktifkan buram agar latar belakang kustom kita terlihat
        setOpaque(false); 
        // 🛑 PENTING 2: Hapus border bawaan
        setBorder(new EmptyBorder(5, 10, 5, 10)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Menggambar latar belakang membulat
        g.setColor(getBackground()); 
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcSize, arcSize);
        
        // Panggil superclass untuk menggambar teks
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Menggambar batas (border) membulat
        g.setColor(getForeground()); // Menggunakan foreground color untuk border
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcSize, arcSize);
    }
    
    // Metode ini memastikan klik mouse hanya dideteksi di dalam bentuk membulat
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, arcSize, arcSize);
        }
        return shape.contains(x, y);
    }
}
