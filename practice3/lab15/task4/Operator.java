package ru.mirea.practice3.lab15.task4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operator implements ActionListener {
    private JTextField txt;
    private JTextField txt1;
    private String oper;
    private double current_text;

    public Operator(JTextField txt, String oper){
        this.txt=txt;
        this.oper = oper;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            current_text = Double.parseDouble(txt.getText());
            oper = "*";
            txt1.setText(txt.getText()+oper);
            txt.setText("");
        }catch(Exception ex){
            txt.setText("пососи");
        }
    }

    public double getCurrent_text() {
        return current_text;
    }

    public String getOper() {
        return oper;
    }
}
