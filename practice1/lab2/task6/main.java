package ru.mirea.lab2.task6;

public class main {
    public static void main(String[] args){
        Circle cr1 = new Circle(3,5,6);
        Circle cr2 = new Circle(12,4,8);

        System.out.println(cr1.getLen());
        System.out.println(cr2.getS());
        System.out.println(cr1.getVs(cr1,cr2));

        cr1.setR(10);
        System.out.println(cr1.getVs(cr1,cr2));
        System.out.println(cr2.getX());
    }
}
