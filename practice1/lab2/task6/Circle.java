package ru.mirea.lab2.task6;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getLen(){
        return Math.PI*r*2;
    }

    public double getS(){
        return Math.PI*r*r;
    }

    public String getVs(Circle x1, Circle x2){
        if(x1.getR()>x2.getR()) return "первая больше";
        else if (x1.getR()<x2.getR()) return "вторая больше";
        else return "окружности равны";
    }

    public String toString(){
        return "окружность расположена по x "+x+" по y"+y+", с радиусом "+r;
    }
}
