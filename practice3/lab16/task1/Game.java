package ru.mirea.practice3.lab16.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JFrame {
    JTextField txt1 = new JTextField(10);
    JTextField txt2 = new JTextField(10);
    JButton one = new JButton("проверить");
    private int number =10;
    private int count=0;
    private int win=0;
    public Game(){
        txt1.setFocusable(false);
        txt1.setEditable(false);
        setLayout(new GridLayout(3,3));
        for(int i=0; i<9;i++){
            setSize(500,500);
            JPanel pn = new JPanel();
            add(pn);
            if(i==1) {
                pn.setBackground(Color.blue);
                pn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Мышь зашла в северную область");
                    }
                });
            }
            if(i==7){
                pn.setBackground(Color.pink);
                pn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Мышь зашла в северную южную область");
                    }
                });
            }
            if(i==3){
                pn.setBackground(Color.GREEN);
                pn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Мышь зашла в западную область");
                    }
                });
            }
            if(i==4){

                pn.add(txt1);
                pn.add(txt2);
                pn.add(one);
            }
            if(i==5){
                pn.setBackground(Color.ORANGE);
                pn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Мышь зашла в восточную область");
                    }
                });
            }
        }
        txt1.setText("Введите число");

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 3) {
                    try {
                        int num = Integer.parseInt(txt2.getText());
                        if(num==number){
                            win=1;
                            JOptionPane.showMessageDialog(null, "Вы угадали число! за "+(count+1) +" попыток", "alert", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                        else if(num>number){
                            JOptionPane.showMessageDialog(null, "Выше число больше", "alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "выше число меньше", "alert", JOptionPane.INFORMATION_MESSAGE);
                        }
                        count++;
                        if(count==3 && win!=1){
                            JOptionPane.showMessageDialog(null, "Вы проиграли чучут не хватило", "alert", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        }
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "ошибка ввода", "alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
