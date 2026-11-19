package ru.mirea.practice4.lab17.task1;

public class Spisok {
    private Node head;

    public Spisok(){
        this.head=null;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void addFirst(Student t){
        Node nw = new Node(t);
        nw.setNext(head);
        head = nw;
    }
    public void addlast(Student t){
        Node nw = new Node(t);
        Node temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(nw);
    }
    public void remove(int index){
        if(index==0){
            head = head.getNext();
            return;
        }
        int count=0;
        Node temp = head;
        while((index-1)!=count){
            temp = temp.getNext();
            count++;
        }
        temp.setNext(temp.getNext().getNext());
    }
    public void sout(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void empty(){
        head=null;
        }
}
