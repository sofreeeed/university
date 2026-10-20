package ru.mirea.lab4.tpart2.task1;

public class Square extends Shape{
    private double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public String getType() {
        return "квадрат";
    }

    @Override
    public double getPerimetr() {
        return 4*a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
