package ru.mirea.lab3.task2;

public class Tester {
    private Circle[] cl;
    private int count=0;
    private Circle cmx;
    private Circle cmn;
    private Circle s;

    public Tester( int len){
        this.cl = new Circle[len];
    }

    public void add(Circle x){
        if(count<cl.length){
            cl[count] = x;
            count++;
        }
    }

    public String mnmx(){
        cmx=cl[0];
        cmn=cl[0];
        for(int i=0; i<cl.length;i++){
            if(cmx.getR()<cl[i].getR()){
                cmx= cl[i];
            }
            if (cmn.getR()>cl[i].getR()){
                cmn=cl[i];
            }
        }
        return "максимальная "+cmx +"\nминимальная "+cmn;
    }

    public void display(){
        int c=1;
        while(c!=0){
            c=0;
            for(int i=0; i<(cl.length-1); i++)
                if(cl[i].getR()>cl[i+1].getR()){
                    s = cl[i];
                    cl[i]=cl[i+1];
                    cl[i+1]=s;
                    c=1;
                }
        }
        for(int i=0; i<cl.length;i++){
            System.out.println(cl[i]);
        }
    }



}
