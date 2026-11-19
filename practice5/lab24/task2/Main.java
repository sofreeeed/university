package ru.mirea.practice5.lab24.task2;

public class Main {
    public static void main(String[] args){
        FunctionalChair fn = new FunctionalChair();
        fn.sum(5,10);
        VictorianChair vc = new VictorianChair(10);
        AbstractChairFactory acf = new ChairFactory();
        Client cl = new Client();
        cl.setChair(acf.createFunctuionalChair());
        cl.sit();
    }
}
