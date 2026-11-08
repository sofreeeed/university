package ru.mirea.practice3.lab15.task1;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    JTextField txt1 = new JTextField(10);
    JTextField txt2 = new JTextField(10);
    JButton enter = new JButton("Вычислить");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton del = new JButton("/");
    JButton umn = new JButton("*");
    Font fnt = new Font("Times new roman", Font.BOLD,75);

    public Calculator(){
        super("Калькулятор");
        setLayout(new GridLayout(4,1));
        setSize(300,300);
        JLabel first = new JLabel("1st number");
        first.setFont(fnt);
        add(first);
        add(txt1);
        txt1.setFont(fnt);
        txt2.setFont(fnt);
        add(new JLabel("2nd number"));
        add(txt2);
        add(plus);
        add(minus);
        add(umn);
        add(del);
        PlainDocument  pd  = (PlainDocument) txt1.getDocument();
        pd.setDocumentFilter(new DocumentFilter(){
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string == null) return;
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                String result = new StringBuilder(currentText).insert(offset, string).toString();
                if (result.matches("\\d+(\\.\\d*)?")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                String result = new StringBuilder(currentText).replace(offset, offset + length, text != null ? text : "").toString();
                if (result.isEmpty() || result.matches("\\d+(\\.\\d*)?")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(txt1.getText().trim());
                    double x2 = Double.parseDouble(txt2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result: " + (x1 + x2), "alert", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ошибка ввода", "alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =Double.parseDouble(txt1.getText().trim());
                    double x2 = Double.parseDouble(txt2.getText().trim());
                    JOptionPane.showMessageDialog(null,"Result: "+(x1-x2),"alert", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ошибка ввода", "alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        umn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =Double.parseDouble(txt1.getText().trim());
                    double x2 = Double.parseDouble(txt2.getText().trim());
                    JOptionPane.showMessageDialog(null,"Result: "+(x1*x2),"alert", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ошибка ввода", "alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =Double.parseDouble(txt1.getText().trim());
                    double x2 = Double.parseDouble(txt2.getText().trim());
                    JOptionPane.showMessageDialog(null,"Result: "+(x1/x2),"alert", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "ошибка ввода", "alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
