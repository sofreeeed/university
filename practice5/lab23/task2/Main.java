package ru.mirea.practice5.lab23.task2;

public class Main {
    public static void main(String[] args){
        LinkedQueue lq = new LinkedQueue();
        System.out.println(lq.isEmpty());
        lq.enqueue(5);
        lq.enqueue("qwert");
        System.out.println(lq.size());
        System.out.println(lq.element());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        lq.enqueue(5.3);
        System.out.println(lq.isEmpty());
        lq.clear();
        System.out.println(lq.isEmpty()+" "+lq.size());

    }
}
