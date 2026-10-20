package ru.mirea.lab4.task2;

public enum Atelier {
    XXS(32){
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40)
    ;
    private final int euroSize;

    Atelier(int euroSize){
        this.euroSize=euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }

    public int getEuroSize(){
        return euroSize;
    }
}
