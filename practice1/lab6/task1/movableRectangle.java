package ru.mirea.lab6.task1;

public class movableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomright;
    public movableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topleft = new MovablePoint(x1,y1, xSpeed, ySpeed);
        bottomright = new MovablePoint(x2,y2,xSpeed, ySpeed);
    }
    public boolean isSpeed(){
        if(topleft.getxSpeed()==bottomright.getxSpeed() && topleft.getySpeed()==bottomright.getySpeed()){
            return true;
        }
        return false;
    }
    public void moveUp(){
        topleft.moveUp();
        bottomright.moveUp();
    }

    public void moveDown(){
        topleft.moveDown();
        bottomright.moveDown();
    }
    public void moveLeft(){
        topleft.moveLeft();
        bottomright.moveLeft();
    }
    public void moveRight(){
        topleft.moveRight();
        bottomright.moveRight();
    }

    public String toString(){
        return "верхняя левая точка прямоугольника расположена "+topleft.toString()+", нижняя правая - "+bottomright.toString();
    }
}
