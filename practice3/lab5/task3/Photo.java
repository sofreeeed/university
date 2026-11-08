package ru.mirea.practice3.lab5.task3;

import javax.swing.*;

public class Photo extends JFrame {
    public Photo(){
        setTitle("Мое изображение");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        add(new ImagePanel("C:/Users/leoni/OneDrive/Изображения/Screenshots/Снимок экрана 2025-12-04 133452.png"));
    }
}
//C:/Users/leoni/OneDrive/Изображения/Screenshots/Снимок экрана 2026-03-21 095250.png