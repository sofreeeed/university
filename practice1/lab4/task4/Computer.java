package ru.mirea.lab4.task4;

import java.util.Scanner;

public class Computer {
    private String word;
    private int n;
    private int count=1;
    Brends[] brend = Brends.values();
    Scanner sc = new Scanner(System.in);
    Memory mem  = new Memory();
    Monitor mon = new Monitor();
    Processor pc = new Processor();

    public Computer(){}

    private void spisok(){
        for(int i=0;i<brend.length;i++){
            System.out.println((i+1)+". "+brend[i]);
        }
    }

    private boolean isWork(){
        return count ==0;
    }

    public void getInfo(){
        while(!isWork()){
            System.out.print("Выберите бренд компьютера\n");
            spisok();
            System.out.println("Чтобы выйти из выбора, введите 0");
            word = sc.nextLine();
            if(word.equals("1") || word.equals("2") || word.equals("3")){
                n = Integer.parseInt(word);
                mem.add(brend[n-1]);
                mon.add(brend[n-1]);
                pc.add(brend[n-1]);
                System.out.println(mem);
                System.out.println(mon);
                System.out.println(pc);
                word="";
            }
            else if(word.equals("0")){
                this.count=0;
            }
            else{
                System.out.println("Введено неправильное число");
            }
        }
    }
}
