package ru.mirea.practice5.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operation implements ActionListener {
    private JTextArea display;
    private String operation;

    public Operation(JTextArea x, String y){
        this.display =x;
        this.operation=y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = display.getText();
        if(operation.equals("-")&&(s.isEmpty()||s.substring(s.length()-1).contains("("))){
            display.setText(display.getText()+"-");
        }
        else if(s.length()>0&&s.substring(s.length()-1,s.length()).matches("[0-9)]")){
            display.setText(display.getText()+operation);
        }

    }
}
