package ru.mirea.lab4.task2;

public class Main {
    public static void main(String[] args) {
        Atelieer at = new Atelieer();
        TesterAtelier[] clothes = {new Tshirt(Atelier.L, 5000, "red"), new Tshirt(Atelier.XS, 1500, "white"),
                new Tshirt(Atelier.S, 4000, "black"), new Pants(Atelier.M, 2000, "yellow"), new Skirt(Atelier.S, 3500, "white"),
                new Tie(Atelier.L, 1000, "blue")};
        System.out.println("мужское ателье:");
        at.dressMan(clothes);
        System.out.println("женское ателье:");
        at.dressWoman(clothes);
    }
}
