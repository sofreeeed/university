package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String[] args){
        Author au=new Author("Pushkin", "pushkinvsdantes@yandex.ru", 'm');
        System.out.println("Имя: "+au.getName());
        System.out.println("Почта: "+au.getEmail());
        System.out.println("Пол: "+au.getGender());
        au.setEmail("pushkim@gmail.com");
        System.out.println(au.getEmail());
    }
}
