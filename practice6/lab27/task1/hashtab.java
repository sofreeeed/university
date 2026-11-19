package ru.mirea.practice6.lab27.task1;

public class hashtab<E, V> {
    private Node head;
    private Node tail;
    private static Node[] tab;
    private static final int p=31;
    public hashtab(){}

    public void HashInit(){
        tab = new Node[11];
        for(int i=0; i<tab.length;i++){
        }
    }

    public int hashtabHash(E key){

        if( key.getClass()==Integer.class){
            int index = (int)key%tab.length;
            return index;
        }
        else if(key.getClass()==Double.class){
            long bit =  Double.doubleToLongBits((double) key);
            int index = Math.abs((int) (bit^(bit>>>32)))%tab.length;
            return index;
        }
        else if(key.getClass()==String.class){
            String s = (String)key;
            int sum=0;
            for(int i=0; i<s.length();i++){
                int cod  = s.charAt(i);
                sum += cod*(Math.pow(p,i));
            }
            int index = sum%tab.length;
            return index;
        }
        return -1;
    }

    public void HashAdd(E key, V value){
        Node cur = new Node(key, value);
        int index = hashtabHash(key);
        Node temp = tab[index];
        if(temp==null){
            tab[index] = cur;
        }
        else{
            while(true){
                if(temp.getKey().equals(cur.getKey())){
                    temp.setValue(cur.getValue());
                    break;
                }
                else if(temp.getNext()==null){
                    temp.setNext(cur);
                    break;
                }
                temp=temp.getNext();
            }
        }
    }
    
    public void display() {
        for (int i = 0; i < tab.length; i++) {
            Node temp = tab[i];
            if (temp != null) {
                while (temp != null) {
                    System.out.print(temp.getKey() + " " + temp.getValue() + "    ");
                    temp = temp.getNext();
                }
                System.out.println();
            }
        }
    }

    public V hashLookUp(E key) {
            Node temp = tab[hashtabHash(key)];
            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    return (V) temp.getValue();
                }
                temp = temp.getNext();
            }
        return null;
    }

    public void hashDelete(E key){
        int index = hashtabHash(key);
            Node temp = tab[index];
            Node prev =null;
            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    if(prev==null) {
                        tab[index] = temp.getNext();
                        break;
                    }
                    else{
                        prev.setNext(temp.getNext());
                        break;
                    }
                }
                prev =temp;
                temp = temp.getNext();
        }
    }

    public int getLength(){
        return tab.length;
    }
}

