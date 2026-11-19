package ru.mirea.practice4.lab20.task1_2;

public class Any <T, V,K >{
    private T one;
    private V two;
    private K three;
    public Any(T one, V two, K three){
        this.one = one;
        this.two = two;
        this.three = three;
    }
    public String toString(){
        return one +" "+ one.getClass()+"\n"+two +" "+ two.getClass()+"\n"+ three+" "+three.getClass();
    }
}
