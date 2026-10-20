package ru.mirea.lab4.tpart2.task5;

public class Reader {
    private String fullName;
    private String nubmer;
    private String Fc;
    private String burn;
    private String number_phone;

    public Reader(String fullName, String number, String Fc, String burn, String number_phone){
        this.fullName = fullName;
        this.nubmer = number;
        this.Fc = Fc;
        this.burn = burn;
        this.number_phone = number_phone;
    }
    public String takeBook(int n){
        return this.fullName + " взял "+n+" книги.";
    }

    public void takeBook(String... x) {
        System.out.print(this.fullName + " взял следующие книги: ");
        for (String i : x) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public void takeBook(Book... x){
        System.out.print(this.fullName + " взял следующие книги: ");
        for (Book i : x) {
            System.out.print(i+", ");
        }
        System.out.println();
    }
    public String returnBook(int n){
        return this.fullName + " вернул "+n+" книги.";
    }

    public void returnBook(String... x) {
        System.out.print(this.fullName + " вернул следующие книги: ");
        for (String i : x) {
            System.out.print(i+", ");
        }
        System.out.println();
    }

    public void returnBook(Book... x){
        System.out.print(this.fullName + " вернул следующие книги: ");
        for (Book i : x) {
            System.out.print(i+", ");
        }
        System.out.println();
    }
}
