package ru.mirea.lab4.task3;

import java.util.Scanner;

public class Tshirt extends Clothes{
    private String[] shirt= {"серая футболка","черная футболка","красная футболка"};
    private int[] price_sh = {500,700,500};
    Scanner sc  = new Scanner(System.in);
    private String number;
    private int num;
    private Clothes cloth;

    public Tshirt(Clothes cl){
        this.cloth = cl;
    }
    private void dis(){
        for(int i = 1;i<4;i++){
            System.out.println(i+". "+this.shirt[i-1]+", стоимость в рублях: "+this.price_sh[i-1]);
        }
        System.out.println("Чтобы выйти в выбор каталога введите 0");
    }

    public void catalog(){
        dis();
        boolean isRight = false;
        while(!isRight){
            System.out.print("Введите номер вещи: ");
            number = sc.nextLine();
            if(number.equals("1") || number.equals("2") || number.equals("3")){
                num = Integer.parseInt(number);
                dis();
                cloth.add(price_sh,shirt,num);

            }
            else if(number.equals("0")){
                isRight = true;
            }
            else{
                System.out.println("Введено недопустимое значение");
            }
        }
    }
}
