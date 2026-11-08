package ru.mirea.practice3.lab15.task2;

import javax.swing.*;
import java.awt.*;

public class Country extends JFrame {
    JTextField txt = new JTextField();
    public Country(){
        String[] countr = {"Australia", "China", "England", "Russia"};
        txt.setEditable(false);
        txt.setFocusable(false);
        JComboBox<String> combobox= new JComboBox<>(countr);
        setSize(500,500);
        setLayout(new GridLayout(2,1));
        combobox.setPreferredSize(new Dimension(100,100));
        add(combobox);
        add(txt);
        combobox.addActionListener(e -> {
            String selected  = (String)combobox.getSelectedItem();
            switch (selected){
                case "Russia": txt.setText("Россия! Путин! Победа!"); break;
                case "Australia": txt.setText("Австралия");break;
                case "China": txt.setText("Китай наш братанчик"); break;
                case "England": txt.setText("Англия"); break;
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
