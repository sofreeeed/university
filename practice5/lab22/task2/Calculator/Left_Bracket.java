package ru.mirea.practice5.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Left_Bracket implements ActionListener {
    private JTextArea display;

    public Left_Bracket(JTextArea x){
        this.display = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText()+"(");
    }
}
