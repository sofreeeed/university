package ru.mirea.lab6.task1;

public class Main {
    public static void main(String[] args){
        movableCircle  cr = new movableCircle(3,4,2,3,5);
        movableRectangle rc = new movableRectangle(4,4,8,0,3,6);
        System.out.println(cr);
        cr.moveDown();
        cr.moveLeft();
        System.out.println(cr);

        rc.moveDown();
        rc.moveRight();
        System.out.println(rc);
    }
}
