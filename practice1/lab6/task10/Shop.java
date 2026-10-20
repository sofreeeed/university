package ru.mirea.lab6.task10;

import java.util.*;

public class Shop {
    private Computer[] comp;
    private int count=0;
    private Scanner sc = new Scanner(System.in);
    private String del;
    private Computer delet;

    public Shop(int n){
        comp = new Computer[n];
    }

    public void add(Computer x){
        this.comp[count] = x;
        count++;
    }

    public void remove(){
        for(int i=0; i<comp.length;i++){
            if (comp[i]!=null){
                System.out.print((i+1)+". ");
                comp[i].append();
                System.out.println();
            }
        }
        System.out.print("Выберите конфигурацию, которую хотите удалить: ");
        del = sc.nextLine();
        for(int i=0; i<comp.length; i++){
            if(String.valueOf(i+1).contains(del) || comp[i].getName().contains(del)){
                this.comp[i]=null;
                for(int j=i; j< comp.length-1; j++){
                    this.comp[j]=comp[j+1];
                }
            }
        }
        comp[comp.length-1]=null;
        for(int i=0; i<comp.length;i++){
            if (comp[i]!=null){
                System.out.print((i+1)+". ");
                comp[i].append();
                System.out.println();
            }
        }
    }

    public void search(){
        System.out.print("Выберите конфигурацию, которую хотите найти: ");
        del = sc.nextLine();
        for(int i=0; i<comp.length; i++){
            if(comp[i]!=null) {
                if (String.valueOf(i + 1).contains(del) || comp[i].getName().contains(del)) {
                    comp[i].append();
                }
            }
        }
    }
}
