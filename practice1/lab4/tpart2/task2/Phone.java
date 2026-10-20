package ru.mirea.lab4.tpart2.task2;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String n, String m, String w){
        this.number = n;
        this.model = m;
        this.weight = w;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public Phone(String n, String m){
        this.number=n;
        this.model=m;
    }

    public Phone(){}

    public void sendMessage(String... x){
        for(String i : x){
            System.out.println(i);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public String toString(){
        return "номер телефона: "+number+", модель телефона: "+model +", вес "+weight;
    }
}
