package ru.mirea.practice2.lab11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd");
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        Scanner sc = new Scanner(System.in);
        boolean isTr = false;
        int yourm = 0;
        int yourd = 0;
        String dm;
        while(!isTr){
            System.out.println("Введите дату следующим образом: число месяц");
            dm = sc.nextLine();
            if(dm.matches("^\\d{1,2} \\d{1,2}$")){
                String[] line = dm.split(" ");
                yourd = Integer.parseInt(String.valueOf(line[0]));
                yourm = Integer.parseInt(String.valueOf(line[1]));
                isTr = true;
                if((yourd>32 && yourd<1) || (yourm>12 && yourm<1)){
                    isTr = false;
                    System.out.println("Было введено неправильное число");
                }
            }
            else  System.out.println("Было введено неправильное число");
        }
        cal1.set(Calendar.MONTH, month+1);
        cal1.set(Calendar.DAY_OF_MONTH, yourm);
        if(cal1.after(cal)){
            System.out.println("Ваша дата меньше");
        }
        else if (cal.after(cal1)){
            System.out.println("Ваша дата больше");
        }
       else System.out.println("равны");
    }
}
