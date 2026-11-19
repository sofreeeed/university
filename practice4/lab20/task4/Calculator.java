package ru.mirea.practice4.lab20.task4;

public class Calculator {
    public static <E extends Number> double sum(E x, E y){
        return x.doubleValue()+y.doubleValue();
    }

    public static <E extends Number> double substring(E x, E y){
        return x.doubleValue()-y.doubleValue();
    }

    public static <E extends Number> double multiply(E x, E y){
        return x.doubleValue()*y.doubleValue();
    }

    public static <E extends Number> double del(E x, E y){
        return x.doubleValue()/y.doubleValue();
    }

}
