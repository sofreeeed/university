package ru.mirea.lab4.task2;

public class Pants extends TesterAtelier implements ManClothing, WomenClothing{
    Pants(Atelier size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void dressman(){
        System.out.printf("мужчина надел штаны цвета - %s, размера %d, которые стоит %d\n", color,size.getEuroSize(),price);
    }
    public void dresswoman(){
        System.out.printf("женщина надела футболку цвета - %s, размера %d, которая стоит %d\n", color,size.getEuroSize(),price);
    }
}
