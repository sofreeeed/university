package ru.mirea.lab4.task4;

public class Processor {
    private int core;
    private double ghz;
    public Processor(){}

    public void add(Brends br){
            switch (br){
                case MSI:
                    this.core = 6;
                    this.ghz = 3.1;
                    break;
                case Lenovo:
                    this.core  = 4;
                    this.ghz = 2.4;
                    break;
                case Asus:
                    this.core  = 6;
                    this.ghz = 2.7;
        }
    }

    public String toString(){
        return "в компьютере стоит процессор с "+this.core+" ядрами, а его частота "+this.ghz+" гц";
    }
}
