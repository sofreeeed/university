package ru.mirea.lab2.task7;

public class Bookshelf {
    private Book[] bs;
    private int count=0;
    private Book[] mx = new Book[1];
    private Book[] mn = new Book[1];

    public Bookshelf(int n){
        this.bs=new Book[n];
    }

    public void add(Book x){
        if(count<bs.length){
            bs[count]=x;
            count+=1;
        }
    }

    public void mn_mx() {
        mx[0] = bs[0];
        mn[0] = bs[0];
        for (int i = 0; i < bs.length; i++) {
            if (mx[0].getYears() < bs[i].getYears()) {
                mx[0] = bs[i];
            }
            if (mn[0].getYears() > bs[i].getYears()) {
                mn[0] = bs[i];
            }
        }
        System.out.println("максимальное "+mx[0]+" минимальное "+mn[0] );
    }

    public Book[] sort(){
        int c=1;
        Book object;
        while(c!=0){
            c=0;
            for(int i=0;i<(bs.length-1);i++){
                if(bs[i].getYears()>bs[i+1].getYears()){
                    object=bs[i];
                    this.bs[i]=bs[i+1];
                    this.bs[i+1]=object;
                    c=1;
                }
            }
        }
        return bs;
    }

    public void display(){
        Book[] bs1 = sort();
        for(int i=0;i<bs1.length;i++){
            System.out.println(bs[i]);
        }
    }

}
