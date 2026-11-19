package ru.mirea.practice4.lab18.task5;

public class ThrowsDemo {
    private int age;

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        this.age = 0;
        // do something with the key
    }
}
