package ru.mirea.practice3.lab16.task2;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    JTextArea txt = new JTextArea();
    String[] color = {"BLUE", "RED", "BLACK"};
    String[]  fn = {"Times New Roman", "MS Sans Serif", "Courier New"};
    Font fnt = new Font("Times new roman", Font.BOLD,75);
    public Game(){
        setSize(300,300);
        txt.setFont(fnt);
        setLayout(new GridLayout(3,1));
        JComboBox<String> comboBox = new JComboBox<>(color);
        JComboBox<String> comboBox1 = new JComboBox<>(fn);
        add(comboBox);
        add(comboBox1);
        add(txt);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBox.addActionListener(e -> {
            switch ((String)comboBox.getSelectedItem()){
                case "BLUE": txt.setForeground(Color.BLUE); break;
                case "BLACK": txt.setForeground(Color.BLACK); break;
                case "RED": txt.setForeground(Color.RED); break;
            }
        });
        comboBox1.addActionListener(e -> {
            switch ((String)comboBox1.getSelectedItem()){
                case "Times New Roman": txt.setFont(new Font("Times New Roman", Font.BOLD, 75)); break;
                case "MS Sans Serif": txt.setFont(new Font("MS Sans Serif", Font.BOLD, 75)); break;
                case "Courier New": txt.setFont(new Font("Courier New", Font.BOLD, 75)); break;
            }
        });

    }

}
