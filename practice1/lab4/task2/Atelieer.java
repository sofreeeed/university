package ru.mirea.lab4.task2;

public class Atelieer{

    public Atelieer(){}

    public void dressMan(TesterAtelier[] x) {
        for (TesterAtelier i : x) {
            if (i instanceof ManClothing) {
                ((ManClothing) i).dressman();
            }
        }
    }

    public void dressWoman(TesterAtelier[] x) {
        for (TesterAtelier i : x) {
            if (i instanceof WomenClothing) {
                ((WomenClothing) i).dresswoman();

            }
        }
    }
}