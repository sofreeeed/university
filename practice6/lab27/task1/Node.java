package ru.mirea.practice6.lab27.task1;

public class Node<E, V> {
    private V value;
    private final E key;
    private Node next;

    public Node(E key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
