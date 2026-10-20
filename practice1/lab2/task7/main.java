package ru.mirea.lab2.task7;

public class main {
    public static void main(String[] args){
        Book bk1 = new Book("push", "evg", 1825);
        Book bk2 = new Book("pushkin", "evgen", 1827);
        Book bk3 = new Book("lermontov", "beglec", 1822);
        Bookshelf bs = new Bookshelf(3);
        bs.add(bk1);
        bs.add(bk2);
        bs.add(bk3);
        bs.mn_mx();

        bs.display();

    }
}
