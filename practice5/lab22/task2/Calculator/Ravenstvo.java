package ru.mirea.practice5.lab22.task2.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Ravenstvo implements ActionListener {
    private JTextArea display;
    private Stack<Double> num;
    private String operation;
    private JTextArea display_right;
    private static Stack<Double> num1;
    private static String operation1;

    public Ravenstvo(JTextArea x, JTextArea y) {
        this.display = x;
        this.display_right = y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        num = new Stack<>();
        String s = display.getText();
        String n = "";
        String symbol;
        if (s.length() > 0) {
            while (!Attention.isPreor(s)) {
                System.out.println(s);
                s = Attention.nummber(s, Attention.oper(s));
                System.out.println(s);
            }
            if (s.contains("+") || (s.contains("-")&&!s.substring(0,1).contains("-"))) {
                System.out.println(s + " " + "s");
                for (int i = 0; i < s.length(); i++) {
                    symbol = String.valueOf(s.charAt(i));
                    if (num.isEmpty() && n.equals("")) {
                        n += symbol;
                    } else if (symbol.matches("[\\d.]")) {
                        n += symbol;
                    } else if (symbol.matches("[+-]")) {
                        System.out.println(n);
                        System.out.println(operation);
                        if (num.isEmpty()) {
                            operation = symbol;
                            num.push(Double.parseDouble(n));
                            n = "";
                        } else {
                            double x = num.peek();
                            num.pop();
                            double y = Double.parseDouble(n);
                            n = "";
                            switch (operation) {
                                case "+":
                                    num.push(x + y);
                                    break;
                                case "-":
                                    num.push(x - y);
                                    break;
                            }
                            System.out.println(num.peek());
                            operation = symbol;
                        }
                    }
                }
                System.out.println(n);
                double x = num.peek();
                num.pop();
                double y = Double.parseDouble(n);
                switch (operation) {
                    case "+":
                        num.push(x + y);
                        break;
                    case "-":
                        num.push(x - y);
                        break;
                }
            } else num.push(Double.parseDouble(s));
            String q = "";
            if (num.peek() == Double.parseDouble(String.valueOf(num.peek()).substring(0, String.valueOf(num.peek()).length() - 2))) {
                q = Double.parseDouble(String.valueOf(num.peek()).substring(0, String.valueOf(num.peek()).length() - 2)) + "";
            } else {
                q = num.peek() + "";
            }
            display_right.setText(display_right.getText() + display.getText());
            display.setText(q);
            display_right.setText(display_right.getText() + " = " + display.getText() + "\n");

        }
    }


    public static String ravn_method(String s) {
        num1 = new Stack<>();
        String n = "";
        String symbol;
        if (s.length() > 0) {
            while (!Attention.isPreor(s)) {
                System.out.println(s);
                s = Attention.nummber(s, Attention.oper(s));
                System.out.println(s);
            }
            if (s.contains("+") || s.contains("-")) {
                System.out.println(s + " " + "s");
                for (int i = 0; i < s.length(); i++) {
                    symbol = String.valueOf(s.charAt(i));
                    if (num1.isEmpty() && n.equals("")) {
                        n += symbol;
                    } else if (symbol.matches("[\\d.]")) {
                        n += symbol;
                    } else if (symbol.matches("[+-]")) {
                        System.out.println(n);
                        System.out.println(operation1);
                        if (num1.isEmpty()) {
                            operation1 = symbol;
                            num1.push(Double.parseDouble(n));
                            n = "";
                        } else {
                            double x = num1.peek();
                            num1.pop();
                            double y = Double.parseDouble(n);
                            n = "";
                            switch (operation1) {
                                case "+":
                                    num1.push(x + y);
                                    break;
                                case "-":
                                    num1.push(x - y);
                                    break;
                            }
                            System.out.println(num1.peek());
                            operation1 = symbol;
                        }
                    }
                }
                System.out.println(n);
                double x = num1.peek();
                num1.pop();
                double y = Double.parseDouble(n);
                switch (operation1) {
                    case "+":
                        num1.push(x + y);
                        break;
                    case "-":
                        num1.push(x - y);
                        break;
                }
            } else num1.push(Double.parseDouble(s));
            String q = "";
            if (num1.peek() == Double.parseDouble(String.valueOf(num1.peek()).substring(0, String.valueOf(num1.peek()).length() - 2))) {
                q = Double.parseDouble(String.valueOf(num1.peek()).substring(0, String.valueOf(num1.peek()).length() - 2)) + "";
            } else {
                q = num1.peek() + "";
            }
            return q;
        }
        return null;
    }
}