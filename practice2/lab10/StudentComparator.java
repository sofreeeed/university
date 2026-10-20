package ru.mirea.practice2.lab10;


import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student a, Student b){
        return a.getFirstname().compareTo(b.getFirstname());
    }
}
