package ru.mirea.practice4.lab20.task4;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<>();
        Random rm = new Random();
        for(int i = 0; i<20; i++){
            x.add( rm.nextInt(-1000,1000));
        }
        System.out.println(x);
        var mnmx = new MinMax<>(x);
        System.out.println(mnmx.mn());
        System.out.println(mnmx.mx());

        ArrayList<Double> x1 = new ArrayList<>();
        for(int i = 0; i<20; i++){
            x1.add( rm.nextDouble(-1000,1000));
        }
        System.out.println(x1);
        var mnmx1 = new MinMax<>(x1);
        System.out.println(mnmx1.mn());
        System.out.println(mnmx1.mx());

        System.out.println("Calculator");
        System.out.println(Calculator.sum(mnmx.mn(), mnmx1.mn()));
        System.out.println(Calculator.substring(mnmx.mn(),mnmx1.mx()));
        System.out.println(Calculator.multiply(mnmx.mn(),mnmx1.mx()));
        System.out.println(Calculator.del(mnmx.mn(),mnmx1.mx()));
    }
}
