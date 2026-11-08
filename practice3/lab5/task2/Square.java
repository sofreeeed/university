package ru.mirea.practice3.lab5.task2;

import java.awt.*;

public class Square extends Shape{
    private int w;
    private int h;
    public Square(int x, int y, int w, int h,Color color){
        super(x,y,color);
        this.w=w;
        this.h=h;
    }

    @Override
    public void otrisovka(Graphics2D gr) {
        gr.setColor(color);
        gr.fillRect(x,y,h,w);
    }
}
