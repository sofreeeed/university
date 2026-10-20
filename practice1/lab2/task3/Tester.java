package ru.mirea.lab2.task3;

public class Tester {
    private Circle[] circles;
    private int count=0;

    public Tester(int howmuch){
        this.circles = new Circle[howmuch];
        this.count=0;
    }

    public boolean addCircle(Circle x){
        if (count<circles.length){
            circles[count]=x;
            count++;
            return true;
        }
        else return false;
    }
    public void display(){
        System.out.println("количество элементов: "+count);
        for(int i=0; i<circles.length;i++){
            System.out.println((i+1)+": "+circles[i]);
        }
    }
}
