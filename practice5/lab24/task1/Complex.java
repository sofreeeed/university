package ru.mirea.practice5.lab24.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(){
        real=0;
        image=0;
    }

    public Complex(int real, int image){
        this.real=real;
        this.image=image;
    }

    public String toString(){
        return real+" + "+image+"i";
    }
}
