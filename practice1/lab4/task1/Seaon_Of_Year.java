package ru.mirea.lab4.task1;

public enum Seaon_Of_Year {
    Winter(-10),
    Spring(10){
        public String getDescription(){
            return "Теплое время года";
        }
    },
    Summer(18),
    Autumn(8)
    ;
    private final int avgT;

    Seaon_Of_Year(int avg){
        this.avgT=avg;
    }

    public int getAvgT(){
        return avgT;
    }

    public String getDescription(){
        return "холодное время года";
    }
}
