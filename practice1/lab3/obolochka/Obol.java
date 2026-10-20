package ru.mirea.lab3.obolochka;

public class Obol {
    public static void main(String[] args){
        Integer x=new Integer(10);
        String m = "101010.2010101";
        double x1  = Double.valueOf(x);
        Double n = 543.5647666766767676766553433335457687789;
        String l = Double.toString(31.4);
        System.out.println(x1);
        System.out.println(m+" = "+(Double.parseDouble(m))*9);
        System.out.println(n.byteValue());
        System.out.println(n.shortValue());
        System.out.println(n.intValue());
        System.out.println(n.longValue());
        System.out.println(n.floatValue());
        System.out.println(n.doubleValue());
        System.out.println(l+"qweqw");
    }
}
