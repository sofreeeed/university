package ru.mirea.lab2.task5;

public class PitomnikSobak {
    private Dog[] dogy;
    private int count;


    public PitomnikSobak(int m){
        this.dogy=new Dog[m];
    }
    public void add(Dog x){
        if (count<dogy.length){
            dogy[count]=x;
            count++;
        }
    }

    public void display(){
        for(int i=0; i<dogy.length; i++){
            System.out.println(dogy[i] + " ");
        }
    }



}
