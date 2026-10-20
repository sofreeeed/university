package ru.mirea.lab3.format.task2;

public class Shop {
    private String[] name = {"хлеб","масло", "сыр","колбаса", "творог", "печенье"};
    private double[] price = {60.0,120.0,200.0,300.0,150.0,130.0};
    private String[] things = new String[10];
    private double sum=0.0;
    private int n;
    private int count=0;
    private Convert cv;

    public Shop(Convert x){this.cv=x;}

    public void add(int n){
        if((n>0)&&(n<7)){
            this.things[this.count] = name[n - 1];
            this.sum += cv.conv(price[n - 1]);
            this.count++;
        }
        else if(n>6){
            System.out.println("Такого предмета нет в магазине");
        }
    }
    public void display() {
        if ((things.length - count)>=0) {
            for (int i = 0; i < name.length; i++) {
                System.out.println((i + 1) + "." + name[i] + " " + cv.getSimbol() + cv.conv(price[i]));
            }
            System.out.println("Чтобы закончить покупки, введите 0");
            if ((things.length - count) > 4) {
                System.out.println("В корзине осталось " + (things.length - count) + " мест");
            } else if ((things.length - count) < 5) {
                System.out.println("В корзине осталось " + (things.length - count) + " места");
            }
        }
    }
    public boolean isFull(){
        return (this.things.length-1)<count;
    }

    public void basket(){
        System.out.println("Содержимое вашей корзины");
        for(int i = 0; i<things.length;i++){
            if(things[i]!=null && i<(things.length-1)){
                System.out.print(things[i]+ ", ");
            }
            else if(things[i]!=null && i==(things.length-1)) {
                System.out.print(things[i] + ". ");
            }
        }
        System.out.print("\nИтоговая сумма: "+cv.getSimbol());
        System.out.printf("%.2f", sum);
    }
}
