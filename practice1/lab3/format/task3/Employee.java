package ru.mirea.lab3.format.task3;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String name, double money){
        this.fullname = name;
        this.salary = money;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
