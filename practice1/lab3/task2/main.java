package ru.mirea.lab3.task2;

public class main {
    public static void main(String[] args){
        Point p1=new Point(1,2);
        Point p2=new Point(3,4);
        Point p3=new Point(6,10);
        Point p4=new Point(8,3);
        Tester ts = new Tester(4);
        Circle cr1 = new Circle(p1);
        Circle cr2 = new Circle(p2);
        Circle cr3 = new Circle(p3);
        Circle cr4 = new Circle(p4);
        System.out.println("1 "+ cr1.getR()+"      2 "+cr2.getR());
        ts.add(cr1);
        ts.add(cr2);
        ts.add(cr3);
        ts.add(cr4);
        System.out.println(ts.mnmx());
        ts.display();
    }
}
