package ru.mirea.lab2.task8;

public class Replace {
    private String[] args;
    private String ft;
    private String sd;
    private int c;

    public Replace(String[] m){
        this.args=m;
    }

    public void replace(){
        c=0;
        for(int i=0;i<args.length; i++){
            ft=args[c];
            args[c]=args[args.length-i-1];
            args[args.length-i-1]=args[c];
            c++;
        }
    }

    public void display(){
        for(int i=0; i<args.length; i++){
            System.out.print(args[i]+" ");
        }
    }
}
