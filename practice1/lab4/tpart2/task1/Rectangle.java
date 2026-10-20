package ru.mirea.lab4.tpart2.task1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double y){
        this.a=a;
        this.b=y;
    }

    @Override
    public double getPerimetr() {
        return 2*(a+b);
    }

    public double getArea() {
        return a*b;
    }

    @Override
    public String getType() {
        return "прямоугольник";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
