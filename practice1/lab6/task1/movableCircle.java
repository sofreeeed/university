package ru.mirea.lab6.task1;

public class movableCircle extends MovablePoint implements Movable{
    public int r;
    public MovablePoint center;

    public movableCircle(int x, int y, int xSpeed, int ySpeed, int r){
        super(x,y,xSpeed,ySpeed);
        this.r = r;
    }

    public String toString(){
        return "окржужность радиуса "+this.r+"с центром"+super.toString();
    }
}
