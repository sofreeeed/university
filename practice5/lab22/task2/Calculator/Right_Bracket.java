package ru.mirea.practice5.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Right_Bracket implements ActionListener {
    private JTextArea display;
    private  int count;
    private int count_left;
    public Right_Bracket(JTextArea x){
        this.display =x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = display.getText();
        for(int i=0;i<s.length();i++){
            String symbol = s.substring(i,i+1);
            if(symbol.equals("(")){
                count_left++;
            }
            else if(symbol.equals(")")){
                count++;
            }
        }
        if(count_left>count){
            count++;
            System.out.println(count_left+" "+count);
            display.setText(display.getText()+")");
        }
    }
}
