package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Shop {
    private Computers[] comp;
    private int count;
    private String name, cost;
    Scanner sc = new Scanner(System.in);
    private String search_name;

    public Shop(int howmuch){
        this.comp=new Computers[howmuch];
    }

    public void add_in_shop(){
        Computers cp = new Computers("s","1");
        for(int i=0; i<comp.length; i++){
            int c = 0;
            while (c < 1) {
                c = 0;
                System.out.print("введите только название компьютера: ");
                name = sc.nextLine();
                if (name.matches("^[a-zA-Z]+$")) {
                    c = 1;
                } else {
                    System.out.println("введены не только символы!");
                    continue;
                }
                System.out.print("Введите цену: ");
                cost = sc.nextLine();
                if (cost.matches("^\\d+$")) {
                    c = 1;
                } else {
                    c=0;
                    System.out.println("введены не только цифры!");
                    continue;
                }
            }
            comp[i]= new Computers(name,cost);

        }
        }

        public void search(){
            int c=0;
            for(int i=0; i<comp.length;i++){
                System.out.println(comp[i].getName());
            }
            System.out.print("Напишите название компютера, цену которого вы хотите узнать: ");
            search_name=sc.nextLine();
            while (c<1){
                for(int i=0;i<comp.length;i++){
                    if(comp[i].getName().contains(search_name)){
                        c=1;
                        System.out.println(comp[i].getName()+"---"+comp[i].getCost());
                        break;
                    }
                    else continue;
                }
            }
        }

        public void del(){
            int c=0;
            for(int i=0; i<comp.length;i++){
                System.out.println(comp[i].getName());
            }
            System.out.print("Напишите название компютера, которого вы хотите удалить: ");
            search_name=sc.nextLine();
            while (c<1){
                for(int i=0;i<comp.length;i++){
                    if(comp[i].getName().contains(search_name)){
                        c=1;
                        comp[i]=null;
                        break;
                    }
                    else continue;
                }
            }
        }


        public void display(){
            System.out.println("каталог магазина");
            for(int i=0;i<comp.length;i++){
                System.out.println((i+1)+": "+comp[i]);
            }
        }
    }



