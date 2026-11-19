package ru.mirea.practice6.lab27.task1;

import java.util.Comparator;

public class Queue<V extends Comparable<V>>{
    private V[] queue_list;
    private int count=0;
    public Queue(){
        this.queue_list =(V[]) new Comparable[11];
    }

     public void push(V key){
        queue_list[count] = key;
        count++;
     }

     public V pop(){
        if(count==0){
            return null;
        }
        if(count==1){
            return queue_list[0];
        }
        int index=0;
        V elem = queue_list[0];
        for(int i=0;i<count-1;i++){
            if (queue_list[i].compareTo(elem) < 0) {
                index = i;
                elem = queue_list[i];
            }
        }
        for(int j=index;j<count-1;j++){
            queue_list[j] = queue_list[j+1];
        }
        count--;
        return elem;
     }

     public int getLength(){
        return count;
     }

    public V element(){
        if (count!=0) {
            if(count==1){
                return queue_list[0];
            }
            int index = 0;
            V elem = queue_list[0];
            for (int i = 1; i < count ; i++) {
                if (queue_list[i].compareTo(elem) < 0) {
                    elem = queue_list[i];
                }
            }
            return elem;
        }
        return null;
    }
}
