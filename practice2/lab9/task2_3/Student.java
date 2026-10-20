package ru.mirea.practice2.lab9.task2_3;

public class Student implements Comparable<Student>{
    private double sr;

    public Student(double x){
        this.sr = x;
    }

    public double getSr() {
        return sr;
    }
    @Override
    public int compareTo(Student other){
        return Double.compare(this.sr, other.sr);
    }
    public String toString(){
    return this.sr+" ";}
}