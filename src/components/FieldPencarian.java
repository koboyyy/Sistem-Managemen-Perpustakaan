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























//package components;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class FieldPencarian extends JPanel {
//
//    private JTextField textField;
//
//    public FieldPencarian() {
//        setLayout(new BorderLayout());
//        setPreferredSize(new Dimension(300, 35));
//        setBackground(Color.WHITE);
//
//        // Border utama
//        setBorder(BorderFactory.createLineBorder(new Color(204,204,204), 1));
//
//        // TextField
//        textField = new JTextField();
//        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//        textField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
//
//        // Icon pencarian
//        JLabel icon = new JLabel(
//            new ImageIcon(getClass().getResource("/img/icon/icons8-reserch-28.png"))
//        );
//        icon.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 10));
//
//        add(textField, BorderLayout.CENTER);
//        add(icon, BorderLayout.EAST);
//    }
//
//    public String getText() {
//        return textField.getText();
//    }
//}