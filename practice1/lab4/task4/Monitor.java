package ru.mirea.lab4.task4;

public class Monitor {
    private int dume;
    private double ghz;
    public Monitor(){}

    public void add(Brends br){
            switch (br){
                case MSI:
                    this.dume = 16;
                    this.ghz = 144;
                    break;
                case Lenovo:
                    this.dume  = 16;
                    this.ghz = 120;
                    break;
                case Asus:
                    this.dume  = 14;
                    this.ghz = 60;
        }
    }

    public String toString(){
        return "в компьютере стоит монитор "+this.dume+" дюймов, а его частота обновления "+this.ghz+" гц";
    }
}
