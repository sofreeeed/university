package ru.mirea.practice2.lab10;

import java.util.IdentityHashMap;

public class Tester {
    public static Student[] iDNumber = new Student[3];
    public static int count=0;
    public static void setArray(Student st){
        iDNumber[count] = st;
        count++;
    }
    public static void main(String[] args){
        Student s1 = new Student("Иван", "Иванов", "IVT", 2, "qwe",1);
        Student s2 = new Student("Дима", "Димов", "IVT", 1, "qwe",3);
        Student s3 = new Student("Александр", "Александров", "IVT", 3, "qwe",4.5);

        setArray(s1);
        setArray(s2);
        setArray(s3);

        System.out.println("По среднему баллу:");
        outArray((Student[]) Merge.merge(iDNumber));

        System.out.println("По имени:");
        outArray((Student[]) Merge.merge(iDNumber, new StudentComparator()));
    }
    public static void outArray(Student[] x){
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }


}
