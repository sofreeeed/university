package ru.mirea.practice4.lab17.task3;

public class CycleSpisok {
    private Node head;
    private Node tail;

    public CycleSpisok(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void addFirst(Student x){
        Node nw  = new Node(x);
        if(isEmpty()){
            head = nw;
            tail = nw;
            head.setPrev(tail);
            tail.setNext(head);
        }
        else{
            nw.setNext(head);
            head.setPrev(nw);
            head = nw;
            tail.setNext(head);
            head.setPrev(tail);
        }
    }

    public void addLast(Student x){
        Node nw =  new Node(x);
        if(isEmpty()){
            head = nw;
            tail = nw;
            head.setPrev(tail);
            tail.setNext(head);
        }
        else{
            tail.setNext(nw);
            nw.setPrev(tail);
            tail = nw;
            tail.setNext(head);
            head.setPrev(tail);
        }
    }

    public void addIndex(Student x, int index){
        Node nw = new Node(x);
        if(isEmpty()){
            if(index==0){
                head = nw;
                tail = nw;
                head.setPrev(tail);
                tail.setNext(head);
            }
            else System.out.println("Нет такого индекса");
        }
        else{
            if(index==0){
                addFirst(x);
            }
            else{
                int count=0;
                Node temp = head;
                do{
                    temp = temp.getNext();
                    count++;
                }while(count!=index&&temp.getNext()!=head);
                if(count==index){
                    nw.setNext(temp);
                    nw.setPrev(temp.getPrev());
                    temp.getPrev().setNext(nw);
                    temp.setPrev(nw);
                }
                else{
                    addLast(x);
                }
            }
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("список пуст");
        }
        tail.setNext(head.getNext());
        head.setPrev(tail);
        head = head.getNext();
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("список пуст");
        }
        else{
            head.setPrev(tail.getPrev());
            tail.getPrev().setNext(head);
            tail= tail.getPrev();
        }
    }

    public void removeIndex(int index){
        if(isEmpty()){
            System.out.println("список пуст");
        }
        else{
            if(index==0){
                removeFirst();
            }
            else {
                Node temp = head;
                int count=0;
                do{
                    count++;
                    temp = temp.getNext();
                }while(count!=index&&temp.getNext()!=head);

                if(count==index){
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setNext(temp.getPrev());
                }
            }
        }
    }

    public void clear(){
        head=null;
    }

    public void sout(){
        if(isEmpty()){
            System.out.println("список пуст");
            return;
        }
        Node temp = head;
        do{
            System.out.println(temp.getData());
            temp = temp.getNext();
        }while(temp!=head);
    }
}
