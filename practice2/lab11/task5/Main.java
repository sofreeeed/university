package ru.mirea.practice2.lab11.task5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        int n=1000;

        ArrayList<Integer>  array= new ArrayList<>();
        LinkedList<Integer> linked  = new LinkedList<>();
        long start = System.nanoTime();
        for(int i = 0; i<n;i++){
            array.add(i);
        }
        long end = System.nanoTime();
        System.out.println("добавление arraylist "+((end-start)/1000));

        start = System.nanoTime();
        for(int i = 0; i<n;i++){
            array.add(i+1,1);
        }
        end = System.nanoTime();
        System.out.println(" вставка arraylist "+((end-start)/1000));

        start = System.nanoTime();
        array.remove(1);
        end = System.nanoTime();
        System.out.println("удаление arraylist "+((end-start)/1000));


        start = System.nanoTime();
        array.contains(890);
        end = System.nanoTime();
        System.out.println("поиск arraylist "+((end-start)/1000));

        start = System.nanoTime();
        for(int i = 0; i<n;i++){
            linked.add(i);
        }
        end = System.nanoTime();
        System.out.println("добавление linkedlist "+((end-start)/1000));

        start = System.nanoTime();
        for(int i = 0; i<n;i++){
            linked.add(i+1,1);
        }
        end = System.nanoTime();
        System.out.println(" вставка linkedlist "+((end-start)/1000));

        start = System.nanoTime();
        linked.remove(1);
        end = System.nanoTime();
        System.out.println("удаление linkedlist "+((end-start)/1000));
        System.out.println(linked);

        start = System.nanoTime();
        linked.contains(890);
        end = System.nanoTime();
        System.out.println("поиск linkedlist "+((end-start)/1000));
    }
}
