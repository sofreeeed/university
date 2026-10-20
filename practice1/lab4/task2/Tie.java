package ru.mirea.lab4.task2;

public class Tie extends TesterAtelier implements ManClothing {
    Tie(Atelier size, int price, String color){
        this.size = size;
        this.price = price;
        this.color=color;
    }

    public void dressman(){
        System.out.printf("мужчина надел футболку цвета - %s, размера %d, которая стоит %d\n",  color,size.getEuroSize(),price);
    }
}
