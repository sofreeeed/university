package ru.mirea.practice5.lab23.task1;

public class Main {
    public static void main(String[] args){
        var queue = new ArrayQueueModule();
        System.out.println(queue.isEmpty());
        queue.enqueue(6);
        queue.enqueue(8);
        System.out.println(queue.isEmpty());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.isEmpty());
        queue.enqueue(6.1);
        System.out.println(queue.element());

    }
}
