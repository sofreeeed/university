package ru.mirea.lab6.task1;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp(){
        this.y +=ySpeed;
    }

    public void moveDown(){
        this.y-=ySpeed;
    }

    public void moveLeft(){
        this.x-=xSpeed;
    }

    public void moveRight(){
        this.x+=xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public String toString(){
        return "по х "+this.x+" по y "+this.y;
    }
}
