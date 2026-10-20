package ru.mirea.lab4.task4;

public class Memory {
    private String hdd;
    private int ram;
    public Memory() {}

    public void add(Brends br){
            switch (br){
                case MSI:
                    this.hdd = "1tb";
                    this.ram = 16;
                    break;
                case Lenovo:
                    this.hdd = "2 tb";
                    this.ram = 64;
                    break;
                case Asus:
                    this.hdd = "1 tb";
                    this.ram = 32;
        }
    }

    public String toString(){
        return "из памяти в процессоре стоит"+this.hdd+", а из оперативной памяти две плашки по"+(this.ram/2)+" gb";
    }
}
