package ru.mirea.lab3.format.task1;

public class Convert {
    private double s;
    private String valuta;

    public Convert(double s){
    this.s=s;
    }

    public double conv(String valuta){
        this. valuta= valuta;
        if (valuta.equals("евро")){
            return s/(96.53);
        }
        else if (valuta.equals("доллар")){
            return s/(84.20);
        }
        else if(valuta.equals("тенге")){
            return s*(5.31);
        }
        return 0;
    }




}