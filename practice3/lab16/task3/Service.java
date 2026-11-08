package ru.mirea.practice3.lab16.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Service extends JFrame {
    JTextField txt1 = new JTextField(10);
    JLabel service  = new JLabel("Service:");
    JTextField txt = new JTextField(10);
    JLabel user_name = new JLabel("User name");
    JLabel password = new JLabel("Password");
    JTextField txt2 =  new JTextField(10);
    Map<String, String> hash = new HashMap<>();
    JButton but = new JButton("Проверить");
    public Service(){
        hash.put("qwery", "qwerty");
        setLayout(new GridLayout(6,1));
        setSize(500,500);
        for(int i=0;i<6;i++){
            JPanel pn = new JPanel();
            if(i==1){
                pn.add(service);
            }
            if(i==1){
                pn.add(txt);
            }
            if(i==2){
                pn.add(user_name);
            }
            if(i==2){
                pn.add(txt1);
            }
            if(i==3){
                pn.add(password);
            }
            if(i==3){
                pn.add(txt2);
            }
            if(i==4){
                pn.add(but);
            }
            add(pn);
        }

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(hash.get(txt1.getText()));
                if(hash.get(txt1.getText()).equals(txt2.getText())){
                    JOptionPane.showMessageDialog(null, "Пароль введен корректно");
                }
                else JOptionPane.showMessageDialog(null, "Пароль введен некорректно");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
