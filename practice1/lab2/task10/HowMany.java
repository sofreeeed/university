package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    private String word;
    private int how=0;
    Scanner sc = new Scanner(System.in);

    public HowMany(){}

    public void reading(){
        System.out.println("введите числа      чтобы завершить программу, напишите exit");
        while(sc.hasNextLine()){
            word=sc.nextLine();
            if(word.equals("exit")){
                break;
            }
            else if (word.isEmpty()) continue;
            how++;
        }
    }

    public String toString(){
        return "количество слов:"+how;
    }


}
