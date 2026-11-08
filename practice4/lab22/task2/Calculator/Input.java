package ru.mirea.practice4.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input implements ActionListener {
    private String digit;
    private JTextArea display;
    public  Input(JTextArea x, String s){
        this.display = x;
        this.digit = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText()+digit);
    }
}
