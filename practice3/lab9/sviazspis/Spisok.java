package ru.mirea.practice3.lab9.sviazspis;

public class Spisok {
    private Node head;

    public Spisok(){
        this.head = null;
    }

    public void add(int x){
        Node nw = new Node(x);
        if(head==null){
            head = nw;
        }
        else{
            Node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(nw);

        }
    }

    public void sout(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }

    public Node middle(Node node){
        Node temp = node;
        Node fast = temp.getNext();

        while(fast!=null && fast.getNext()!=null){
            temp = temp.getNext();
            fast = fast.getNext().getNext();
        }
        return temp;
    }

    public Node merge(Node left, Node right){
        Node temp = new Node(0);
        Node tail = temp;
        while(left!=null && right!=null){
            if(left.getData()<=right.getData()){
                tail.setNext(left);
                left = left.getNext();
            } else {tail.setNext(right); right = right.getNext();}
            tail = tail.getNext();
        }
        if(left!=null){
            tail.setNext(left);
        }
        else{
            tail.setNext(right);
        }
        return temp.getNext();
    }

    public Node mergeSort(Node node){
        if(node==null||node.getNext()==null){
            return node;
        }
        Node mid = middle(node);
        Node nn = mid.getNext();
        mid.setNext(null);
        Node left = mergeSort(node);
        Node right = mergeSort(nn);

        return merge(left,right);
    }

    public void sort(){
        head  = mergeSort(head);
    }

}
