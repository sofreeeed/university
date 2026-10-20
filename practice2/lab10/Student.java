package ru.mirea.practice2.lab10;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String firstname;
    private String secondname;
    private String spec;
    private int kurs;
    private String group;
    private double gpa;

    public Student(String firstname, String secondname, String spec, int kurs, String group, double gpa){
        this.firstname = firstname;
        this.secondname = secondname;
        this.kurs= kurs;
        this.group = group;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public String getFirstname(){
        return firstname;
    }

    public int compareTo(Student other){
        return Double.compare(this.gpa, other.gpa);
    }

    public String toString(){
        return "Студент "+ firstname +" "+ secondname+" , учащийся на направлении"+spec+" на "+kurs+" курсе с баллов "+gpa;
    }
}
