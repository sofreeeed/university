package ru.mirea.lab4.tpart2.task1;


public class Shape {


    public String getType(){
        return "фигура";
    }

    public double getArea(){
        return 0.0;
    }

    public double getPerimetr(){
        return 0.0;
    }

    public String toString(){
        return "фигура "+getType()+" имеет площадь "+ getArea()+", периметр "+getPerimetr();
    }
}
