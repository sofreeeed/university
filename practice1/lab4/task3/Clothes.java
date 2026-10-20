package ru.mirea.lab4.task3;

public class Clothes {
    public String[] shopping = new String[20];
    public int sum;

    public Clothes(){}

    public void add(int[] s,String[] x, int num){
        this.sum+=s[num-1];
        for(int j=0; j<this.shopping.length;j++){
            if(this.shopping[j]==null){
                this.shopping[j]=x[num-1];
                break;
            }
        }
    }

    public String[] getShopping() {
        return shopping;
    }

    public int getSum() {
        return sum;
    }

    public void display(){
        System.out.print("В корзине находятся: ");
        for(int i=0;i<this.shopping.length;i++){
            if(this.shopping[i]!=null){
                System.out.print(this.shopping[i]+", ");
            }
        }
        System.out.println("\nОбщая сумма корзины - "+this.sum);
    }
}
