package ru.mirea.lab2.task3;

public class Point {
    private double x=0.0;
    private double y=0.0;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void move(double xDisp, double yDisp){
        this.x=xDisp;
        this.y=yDisp;
    }
    public String toString(){
        return "точка расположена на " + x + " по x и на " + y+" по y";
    }
}
