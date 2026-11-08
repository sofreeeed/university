package ru.mirea.practice4.lab17.task2;

public class Dvusvias {
    private Node head;
    private Node tail;

    public Dvusvias(){
        this.head=null;
        this.tail=null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void addFirst(Student x){
        Node nw = new Node(x);
        if(head==null){
            head=nw;
            tail=nw;
        }else {
            nw.setNext(head);
            head.setPrev(nw);
            head = nw;
        }
    }

    public void addlast(Student x){
        Node nw  = new Node(x);
        if(head==null){
            head=nw;
            tail=nw;
        }
        else{
            tail.setNext(nw);
            nw.setPrev(tail);
            tail=nw;
        }
    }

    public void addIndex(Student x, int index){
        Node nw = new Node(x);
        if(index==0){
            if(head==null) {
                head = nw;
                tail = nw;
            }
            else{
                nw.setNext(head);
                head.setPrev(nw);
                head=nw;
            }
        }
        else{
            int count=0;
            Node temp=head;
            while((count!=index-1)&&temp.getNext()!=null){
                temp = temp.getNext();
                count++;
            }
            nw.setNext(temp.getNext());
            nw.setPrev(temp);
            temp.getNext().setPrev(nw);
            temp.setNext(nw);
        }
    }

    public void remove(int index){
        if(isEmpty()){
            System.out.println("список пустой");
        }
        else{
            if(index==0){
                head = head.getNext();
            }
            else {
                Node temp = head;
                int count = 0;
                while ((count != index - 1) && temp.getNext() != null) {
                    temp = temp.getNext();
                    count++;
                }
                if (count != index - 1) {
                    System.out.println("нет такого индекса");
                }
                else if(temp.getNext().getNext()==null){
                    temp.setNext(null);
                    tail = temp;

                }
                else {
                    temp.getNext().getNext().setPrev(temp);
                    temp.setNext(temp.getNext().getNext());
                }
            }
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("пустой список");
        }
        else{
            head = head.getNext();
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("пустой список");
        }
        else{
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public void sout(){
        if(isEmpty()){
            System.out.println("список пуст");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }
        }
    }
}
