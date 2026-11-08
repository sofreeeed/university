package ru.mirea.practice3.lab12.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Photo extends JFrame{
    Scanner sc = new Scanner(System.in);
    JPanel pn = new JPanel();
    public Photo(){
        System.out.println("Введите путь к файлу");
        setSize(800,800);
        add(new ImagePanel("C:/Users/leoni/OneDrive/Изображения/Screenshots/Снимок экрана 2026-10-28 185541.png"));

    }

}
