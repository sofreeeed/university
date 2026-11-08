package ru.mirea.practice4.lab20.task2;

import java.io.Serializable;

public class Any <T extends Comparable<T>, V extends Animal<V> & Serializable,K >{
    private T one;
    private V two;
    private K three;
    public Any(T one, V two, K three){
        this.one = one;
        this.two = two;
        this.three = three;
    }
    public String toString(){
        return one +" "+ one.getClass()+"\n"+two +" "+ two.getClass()+"\n"+ three+" "+three.getClass();
    }
}
