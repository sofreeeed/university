package ru.mirea.practice5.lab23.task1;


public class ArrayQueueModule<E> {
    private static Object[] queue = new Object[1];
    private static int size_massiv=0;
    private static int head=0;
    private static int tail=0;

    public static void enqueue(Object x){
        if(size_massiv==queue.length){
            Object[] current = queue;
            queue = new Object[queue.length*2];
            for(int i=0;i<size_massiv;i++){
                queue[i]= current[(head+i)%current.length];
            }
            head=0;
            tail=size_massiv;
        }
        queue[tail]=x;
        tail=(tail+1)%queue.length;
        size_massiv++;
    }

    public static Object element(){
        if(size_massiv!=0) {
            Object x = queue[head];
            return x;
        }
        return null;
    }

    public static Object dequeue(){
        if(size_massiv!=0) {
            Object x = queue[head];
            queue[head] = null;
            head = (head + 1) % queue.length;
            size_massiv--;
            return x;
        }
        return  null;
    }

    public static int size(){
        return size_massiv;
    }

    public static boolean isEmpty(){
        return size_massiv==0;
    }

    public static void clear(){
        queue = new Object[1];
        head=0;
        tail=0;
        size_massiv=0;
    }

}
