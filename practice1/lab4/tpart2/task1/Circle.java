package ru.mirea.lab4.tpart2.task1;

public class Circle extends Shape {
    private double a;

    public Circle(double a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "круг";
    }

    @Override
    public double getPerimetr() {
        return a*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*a*a;
    }

    public String toString(){
        return super.toString();
    }
}
