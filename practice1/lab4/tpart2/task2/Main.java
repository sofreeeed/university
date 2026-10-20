package ru.mirea.lab4.tpart2.task2;

public class Main {
    public static void main(String[] args){
        Phone p1 = new Phone("89160658944", "iphone16", "200");
        Phone p2 = new Phone("89907771122", "iphone16", "200");
        Phone p3 = new Phone("89837821214", "iphone16", "200");
        Phone p4 = new Phone("89837821214", "iphone16");
        Phone p5 = new Phone(p3.getNumber(), p3.getModel());
        Phone p6 = new Phone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("номер телефона: "+p4.getNumber()+", модель телефона: "+p4.getModel());
        System.out.println("номер телефона: "+p5.getNumber()+", модель телефона: "+p5.getModel());
        p6.receiveCall("Иван");
        p6.sendMessage("89992221133");
        p6.sendMessage("89992221133", "8777721213341");
    }
}
