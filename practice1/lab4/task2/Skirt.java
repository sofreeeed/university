package ru.mirea.lab4.task2;

public class Skirt extends TesterAtelier implements WomenClothing{
    Skirt(Atelier size, int price, String color){
        this.size=size;
        this.price = price;
        this.color = color;
    }
    public void dresswoman(){
        System.out.printf("женщина надела юбку цвета - %s, размера %d, которая стоит %d\n",color,size.getEuroSize(),price);
    }
}
