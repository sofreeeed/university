package ru.mirea.practice5.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Point implements ActionListener {
    private JTextArea display;
    public Point(JTextArea x){
        this.display = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = display.getText();
        boolean isPoint = false;
        if(s.length()>0) {

            String symbol = s.substring(s.length() - 1, s.length());
            if (symbol.matches("\\d")) {
                for (int i = s.length() - 1; i > -1; i--) {
                    symbol = s.substring(i, i + 1);
                    if (symbol.contains("+") || symbol.contains("-") || symbol.contains("/") || symbol.contains("*")) {
                        break;
                    } else if (symbol.contains(".")) {
                        isPoint = true;
                        break;
                    }
                }
                if (!isPoint) {
                    display.setText(display.getText() + ".");
                }
            }
        }
    }
}
