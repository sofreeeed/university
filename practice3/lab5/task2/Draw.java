package ru.mirea.practice3.lab5.task2;

import java.awt.*;
import javax.swing.*;

public class Draw extends JPanel {
    private Shape[] shapes = new Shape[20];
    private int count;


    public void addShape(Shape shapes1){
        this.shapes[this.count] = shapes1;
        this.count++;
        repaint();
    }

    protected void paintComponent(Graphics gr1){
        super.paintComponent(gr1);
        Graphics2D gr = (Graphics2D) gr1;

        for(Shape i: shapes){
            if(i!=null) {
                i.otrisovka(gr);
            }
            else break;
        }
    }
}
