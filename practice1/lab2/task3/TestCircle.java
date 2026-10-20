package ru.mirea.lab2.task3;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        int hm;
        Scanner sc = new Scanner(System.in);
        hm=sc.nextInt();
        Point pnt = new Point(4,5);
        Tester test = new Tester(hm);
        System.out.println(pnt);
        pnt.move(5,4);
        System.out.println(pnt);
        for(int i=0;i<hm;i++) {
            Circle cr=new Circle(i, i+1,i+2);
            test.addCircle(cr);
        }
        test.display();
    sc.close();

    }
}
