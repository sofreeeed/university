package ru.mirea.lab3.format.task3;

public class Main {
    public static void main(String[] args){
        int i=0;
        Employee em = new Employee("Ivan", 5000);
        Employee em1 = new Employee("Kirill", 150000);
        Employee em2 = new Employee("Dima", 80000);
        Employee em3 = new Employee("Egor", 20000);
        Report rp = new Report();
        rp.add(em);
        rp.add(em1);
        rp.add(em2);
        rp.add(em3);
        rp.generateReport();

    }
}
