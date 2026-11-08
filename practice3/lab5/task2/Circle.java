package ru.mirea.practice3.lab5.task2;

import java.awt.*;
public class Circle extends Shape {
    private int r;

    public Circle(int x, int y, int r, Color color){
        super(x,y,color);
        this.r=r;
    }


    @Override
    public void otrisovka(Graphics2D gr) {
        gr.setColor(color);
        gr.fillOval(x-r,y-r,r*2,r*2);
    }
}
