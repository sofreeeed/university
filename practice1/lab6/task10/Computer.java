package ru.mirea.lab6.task10;

import java.util.*;

public class Computer implements Append{
    private Process cpu;
    private Monitor monik;
    private int count=0;
    private Scanner sc = new Scanner(System.in);
    private String name;

    public Computer() {
        while(count!=3){
            if(count==0) {
                System.out.println("Выберите бренд процеессора:\n1.Intel\n2.Amd");
                switch(sc.nextLine()){
                    case "1": cpu = new Process(Brend.Intel); break;
                    case "2": cpu = new Process(Brend.Amd); break;
                }
                count++;
            }
            else if(count==1){
                System.out.println("Выберите бренд монитора:\n1.Samsung\n2.Dell");
                switch(sc.nextLine()){
                    case "1": monik = new Monitor(Brend.Sumsung); break;
                    case "2": monik = new Monitor(Brend.Dell); break;
                }
                count++;
            }
            else if(count==2){
                System.out.println("Придумайте название конфигурации");
                this.name = sc.nextLine();
                count++;
            }
            System.out.println(count);
        }
    }
    public void append(){
        System.out.println( "В конфигурации " +name+ " стоит:");
        cpu.append();
        System.out.println();
        monik.append();
    }

    public String getName() {
        return name;
    }
}
