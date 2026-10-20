package ru.mirea.lab3.format.task3;

import java.util.Formatter;

public class Report {
    private Employee[] worker=new Employee[5];
    private int count=0;
    private Formatter fmt = new Formatter();


    public Report(){
    }
    public void add(Employee x){
        this.worker[count]=x;
        this.count++;
    }


    public void generateReport(){
        for(int i=0;i<worker.length;i++) {
            if(worker[i]!=null) {
                System.out.printf("Работник %6s получает зарплату в размере %10.2f%n", worker[i].getFullname(), worker[i].getSalary());
            }
        }
    }


}
