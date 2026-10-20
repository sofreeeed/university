package ru.mirea.lab6.task11;

import java.util.*;

public class Celsia implements Converter{
    private double gr;
    Scanner sc = new Scanner(System.in);
    private String s;

    public Celsia(){
        int i=1;
        while(i!=0){
            System.out.print("Введите количество градусов: ");
            s = sc.nextLine();
            try {
                gr = Double.parseDouble(s);
                System.out.println(gr);
                i=0;
            }catch (InputMismatchException | NumberFormatException e ){
                System.out.println("Введено не число!");

            }

        }
    }

    public void convert(){
        int i=1;
        while(i!=0){
            System.out.println("Выберите в какую меру измерения температуры вы хотите перевести: \n1.Кельвина\n2.Фаренгейта");
            s = sc.nextLine();
            if(s.equals("1")){
                System.out.println(this.gr+273);
                i=0;
            }
            else if(s.equals("2")){
                System.out.println((((gr*9/5))+32));
                i=0;
            }

        }

    }

}
