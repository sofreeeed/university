package ru.mirea.practice4.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Ravenstvo implements ActionListener {
    private JTextArea display;
    private Stack<Integer> num;
    private String operation;

    public Ravenstvo(JTextArea x){
        this.display = x;
        num = new Stack<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = display.getText();
        String n = "";
        String symbol;
        if(s.length()>0){
            for(int i=0; i<s.length();i++){
                symbol = String.valueOf(s.charAt(i));
                if(symbol.matches("[\\d.]")){
                    n+=symbol;
                }
                else if(symbol.matches("[*+-/]")){
                    operation = symbol;
                    if(num.isEmpty()) {
                        num.push(Integer.parseInt(n));
                        n = "";
                    }else{
                        int x = num.peek();
                        num.pop();
                        int y = Integer.parseInt(n);
                        n="";
                        num.push(x+y);
                        switch(operation) {
                            case "+":
                                num.push(x+y);
                                break;
                        }
                        operation="";
                    }
                }
            }
            display.setText(String.valueOf(num.peek()));
        }
    }
}
