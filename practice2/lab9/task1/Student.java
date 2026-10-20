package ru.mirea.practice2.lab9.task1;

public class Student implements Comparable<Student>{
    private int idNumber;
    public Student(int x){
        this.idNumber=x;
    }

    public int getIdNumber() {
        return idNumber;
    }
    @Override
    public int compareTo(Student other){
        return Integer.compare(this.idNumber, other.idNumber);
    }
}
