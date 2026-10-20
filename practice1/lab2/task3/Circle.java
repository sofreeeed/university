package ru.mirea.lab2.task3;

public class Circle {
    private Point Center;
    private double r;

    public Circle(double x, double y, double r){
        this.Center =new Point(x,y);
        this.r=r;
    }

    public Point getCenter() {
        return Center;
    }

    public void setCenter(Point center) {
        this.Center = center;
    }


    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public String toString(){
        return "окружность с центром "+Center+" и радиусом "+r;
    }
}
