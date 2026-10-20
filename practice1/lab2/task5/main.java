package ru.mirea.lab2.task5;

public class main {
    public static void main(String[] args){
        Dog dg1 = new Dog("zikov", 5);
        Dog dg2 = new Dog("debil", 5);
        Dog dg3 = new Dog("small", 2);
        Dog dg4 = new Dog("jana", 1);
        Dog dg5 = new Dog("tomy", 10);
        PitomnikSobak ps=new PitomnikSobak(5);
        System.out.println(dg1);
        dg1.perevod();
        ps.add(dg1);
        ps.add(dg2);
        ps.add(dg3);
        ps.add(dg4);
        ps.add(dg5);
        ps.display();




    }
}
