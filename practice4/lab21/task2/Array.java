package ru.mirea.practice4.lab21.task2;

public class Array<E> {
    private int size;
    private Object[] elements;

    public Array() {
        elements = new Object[10];
        this.size = 0;
    }

    public void add(E e) {
        if (size <= elements.length){
            elements[size] = e;
        size++;
    }else{
        Object[] neww = new Object[elements.length*2];
        for(int i=0;i< elements.length;i++){
            neww[i]=elements[i];
        }
        elements=neww;
    }
}
    public void display(){
        for(Object e: elements){
            if(e!=null) {
                System.out.print(e + " ");
            }
        }
    }
    public E display_index(int a){
        try{
                return (E) elements[a];
        }catch(Exception ex){
        return null;
    }
        }
}
