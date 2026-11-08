package ru.mirea.practice3.lab12.task1;


import ru.mirea.practice3.lab5.task2.Circle;
import ru.mirea.practice3.lab5.task2.Draw;
import ru.mirea.practice3.lab5.task2.Shape;
import ru.mirea.practice3.lab5.task2.Square;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    JPanel pn = new JPanel();
    Draw[] draw = new Draw[20];
    Shape sh;
    public Window(){
        setLayout(new GridLayout(4,5));
        setBackground(Color.WHITE);
        for(int i=0;i<20;i++){
            draw[i] =  new Draw();
            if(i%2==0) {
                draw[i].addShape(new Circle(50, 50, 50, Color.BLACK));
            }
            else{
                draw[i].addShape(new Square(70,70,70,70,Color.BLUE));
            }
            add(draw[i]);
        }
        setSize(500,500);

    }

}
