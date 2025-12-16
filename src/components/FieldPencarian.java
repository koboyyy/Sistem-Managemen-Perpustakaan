package components;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class FieldPencarian extends JTextField {

    public FieldPencarian() {
        setPreferredSize(new Dimension(300, 35));
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 1), BorderFactory.createEmptyBorder(5, 10, 5, 10)));
    }
}