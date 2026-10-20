package ru.mirea.lab7.task7;

public class Main {
    public static void main(String[] args){
        Printable[] pr = {new Book("Сказка", "Толстой"), new Book("приключение", "Тютчев"), new Magazine("топ-10 богатейших людей России", "ne znau")};
        Book.printBook(pr);
        Magazine.printBook(pr);
    }
}
