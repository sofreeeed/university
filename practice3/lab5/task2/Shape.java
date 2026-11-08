package ru.mirea.practice3.lab5.task2;

import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;

    public Shape(int x, int y, Color color){
        this.x=x;
        this.y=y;
        this.color = color;
    }
    public abstract void otrisovka(Graphics2D gr);
}
