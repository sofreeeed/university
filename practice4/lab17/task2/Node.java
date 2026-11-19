package ru.mirea.practice4.lab17.task2;

public class Node {
    private Student data;
    private Node next;
    private Node prev;

    public Node(Student data){
        this.data = data;
        this.next =null;
        this.prev =null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
