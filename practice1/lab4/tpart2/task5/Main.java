package ru.mirea.lab4.tpart2.task5;

public class Main {
    public static void main(String[] args){

        Book b1  = new Book("шинель", "Акий Акакиевич");
        Book b2 =  new Book("Капитанская дочка", "А.С Пушкин");
        Reader rd   = new Reader("Иванов Иван Иванович","25к123", "ИИИ", "26.01.03", "89999213123");
        System.out.println(rd.takeBook(3));
        rd.takeBook("приключения", "энкиклопедия", "роман");
        rd.takeBook(b1,b2);
        System.out.println(rd.returnBook(3));
        rd.returnBook("приключения", "энкиклопедия", "роман");
        rd.returnBook(b1,b2);

    }
}
