package ru.mirea.practice3.lab15.task4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input implements ActionListener {
    private String digit;
    private JTextField display;
    public  Input(JTextField x, String s){
        this.display = x;
        this.digit = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText()+digit);
    }
}
