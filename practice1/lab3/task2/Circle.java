package ru.mirea.lab3.task2;


public class Circle {
    public Point p;
    public double r;

    public Circle(Point x){
        this.p =x ;
        this.r  = Math.random();
    }

    public String toString(){
        return "оружность находится по х: "+p.getX()+" по y: "+p.getY()+" с радиусом: "+r;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
