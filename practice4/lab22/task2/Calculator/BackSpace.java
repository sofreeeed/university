package ru.mirea.practice4.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackSpace implements ActionListener {
    private JTextArea display;

    public BackSpace(JTextArea x){
        this.display = x;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s =display.getText();
        if(s.length()>0){
            display.setText(s.substring(0,s.length()-1));
        }
    }
}
