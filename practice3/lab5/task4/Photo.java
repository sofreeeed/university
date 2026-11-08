package ru.mirea.practice3.lab5.task4;

import javax.swing.*;

public class Photo extends JFrame{
    public Photo(){
        setTitle("Мое изображение");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        String[] images = {
                "C:/Users/leoni/OneDrive/Изображения/Screenshots/Снимок экрана 2026-03-21 095250.png",
                "C:/Users/leoni/OneDrive/Изображения/Screenshots/Снимок экрана 2026-03-21 110329.png"};
        int delay = 500;
        add(new ImagePanel(images, delay));
    }
}
