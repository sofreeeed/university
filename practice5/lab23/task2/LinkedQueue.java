package ru.mirea.practice5.lab23.task2;

public class LinkedQueue implements Methods{
    private Node head;
    private Node tail;
    private int size_linkedqueue=0;

    public LinkedQueue(){
        this.head=null;
        this.tail=null;
    }

    @Override
    public void enqueue(Object x) {
        Node nw = new Node(x);
        if(head==null){
            this.head = nw;
            this.tail = nw;
            size_linkedqueue++;
        }else{
            tail.setNext(nw);
            tail = nw;
            size_linkedqueue++;
        }
    }

    @Override
    public Object element() {
        return head.getData();
    }

    @Override
    public Object dequeue() {
        Node current = head;
        if(current.getNext()!=null) {
            head = current.getNext();
        }else head = null;
        size_linkedqueue--;
        return current.getData();
    }

    @Override
    public boolean isEmpty() {
        if(head==null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size_linkedqueue;
    }

    @Override
    public void clear() {
        head=null;
        size_linkedqueue=0;
    }
}
