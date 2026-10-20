package ru.mirea.lab2.task2;

public class TetsBall {
    public static void main(String[] args){
        Ball ball = new Ball(3,4);
        System.out.println(ball);

        ball.setX(5);
        ball.setY(6);
        System.out.println(ball);

        ball.setXY(10,14);
        System.out.println(ball);

        ball.move(8,10);
        System.out.println(ball);
    }
}
