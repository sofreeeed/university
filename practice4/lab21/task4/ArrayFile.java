package ru.mirea.practice4.lab21.task4;

import java.io.File;

public class ArrayFile<E> {
    private int size;
    private Object[] elements;

    public ArrayFile(){
        elements = new Object[5];
        size=0;
    }

    public void add(String path){
        File dir = new File(path);
        try{
            String[] s = dir.list();
            for(int i=0;i<5;i++){
                elements[i] = s[i];
            }
            display(elements);

        }catch (Exception ex){
            System.out.println("Такой директории");
        }
    }

    public void display(Object[] a){
        for(Object q: a){
            System.out.println(q);
        }
    }

}
