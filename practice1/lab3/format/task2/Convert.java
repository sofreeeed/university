package ru.mirea.lab3.format.task2;

public class Convert {
    private String object;
    private String simbol;
    private double salary;
    public Convert(){}
    public void Convert_add(String valuta){
        this.object = valuta;
        if(this.object.equals("евро")){
            this.simbol = "€";
        }
        else if(this.object.equals("доллары")){
            this.simbol = "$";
        }
        else{
            this.simbol  = "₽";
        }
    }

    public double conv(double price){
        if(this.object.equals("евро")){
            return price/(96.53);
        }
        else if(this.object.equals("доллары")){
           return price/(84.20);
        }
        else{
            return price;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSimbol() {
        return simbol;
    }

    public String getObject() {
        return object;
    }
}
