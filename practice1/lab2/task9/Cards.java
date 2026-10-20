package ru.mirea.lab2.task9;

import java.util.Random;

public class Cards {
    private String mast;
    private String number;
    Random rm = new Random();
    private int n;

    public Cards(String mast, String number){
        this.mast=mast;
        this.number=number;
    }

    public String getMast() {
        return mast;
    }

    public String getNumber() {
        return number;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void rmast(){
        n=rm.nextInt(4);
        if (n==0){
            this.mast= "черви";
        }
        else if (n==1){
            this.mast= "крести";
        }
        else if(n==2){
            this.mast= "пики";
        }
        else this.mast= "бубны";
    }
    public void rnum(){
        n=rm.nextInt(12);
        if ((n+2)<10){
            this.number = (n+2)+"";
        }
        else if((n+2)==10){
            this.number = "валет";
        }
        else if((n+2)==11){
            this.number = "дама";
        }
        else if((n+2)==12){
            this.number = "король";
        }
        else{
            this.number = "туз";
        }
    }
    public String toString(){
        return number+" "+mast;
    }
}
