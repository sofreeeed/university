package ru.mirea.lab6.task10;

public class Process implements Append{
    private String type;
    private Brend name;
    private int price;

    public Process(Brend x){
        this.type = "Процессор";
        switch(x){
            case Intel:
                this.name = x;
                this.price = 15000;
                break;
            case Amd:
                this.name = x;
                this.price = 13000;
        }
    }
    public void append(){
        System.out.print(type+" бренда "+name+" стоимостью "+price);
    }
}
