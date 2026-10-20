package ru.mirea.lab4.task4;

public enum Brends {
    MSI("MSI"),
    Asus("Asus"),
    Lenovo("Lenovo"),
    ;
    public final String description;

    Brends(String x){
        this.description= x;
    }

    public String getDescripnion(){
        return description;
    }
}
