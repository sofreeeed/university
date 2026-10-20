package ru.mirea.lab6.task6;

public class Main {
    public static void main(String[] args){
        Printable[] pr = new Printable[]{new Book("Капитанская дочка", 1000), new Shop("Писк моды 2026", 5000), new Book("Идиот", 1200)};
        for(Printable i : pr){
            i.print();
        }
    }
}
