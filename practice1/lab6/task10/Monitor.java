package ru.mirea.lab6.task10;

public class Monitor implements Append{
    private String type;
    private Brend name;
    private int price;

    public Monitor(Brend x){
        this.type = "Монитор";
        switch(x){
            case Sumsung:
                this.name = x;
                this.price = 20000;
                break;
            case Dell:
                this.name = x;
                this.price = 10000;
        }
    }

    public void append(){
        System.out.print(type+" бренда "+name+" стоимостью "+price);
    }
}
