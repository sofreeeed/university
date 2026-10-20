package ru.mirea.practice2.lab13.task4;

public class Shirts {
    private String index;
    private String type;
    private String color;
    private String size;

    public Shirts(String x){
        String[] sh = x.split(",");
        index = sh[0];
        type = sh[1];
        color = sh[2];
        size = sh[3];
    }
    public String toString(){
        return "артикул "+index+" тип "+type+" цвет "+color+" размер "+size;
    }
}