package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Computers {
    private String name;
    private String cost;

    public Computers(String name, String cost){
        this.name = name;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }

    public String toString(){
        return "название: "+name+" цена: "+cost;
    }
}
