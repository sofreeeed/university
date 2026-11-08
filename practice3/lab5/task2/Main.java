package ru.mirea.practice3.lab5.task2;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rm  = new Random();
        Shape sh = new Circle(40,40,20,Color.RED);
        JFrame frame = new JFrame("Фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1980,1020);
        Draw panel = new Draw();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(1980,1020));
        for(int i=0;i<10;i++) {
            panel.addShape(new Circle(rm.nextInt(10,20)+i*100+100, rm.nextInt(5,10)+i*20+100, rm.nextInt(20,60), Color.RED));
            panel.addShape(new Square(rm.nextInt(10,20)+i*170+100, rm.nextInt(5,10)+i*50+200, rm.nextInt(60,130), rm.nextInt(100,200),Color.BLUE));
        }
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
