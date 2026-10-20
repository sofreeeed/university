package ru.mirea.practice2.lab11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        Date date =  new Date();
        Scanner sc = new Scanner(System.in);
        String s;
        int count=0;
        while(count!=5) {
            if(count==0) {
                System.out.println("Введите год");
                s = sc.nextLine();
                if (s.matches("\\d+")) {
                    date.setYear(Integer.parseInt(s) - 1900);
                    cal.set(Calendar.YEAR, Integer.parseInt(s));
                    count++;
                } else continue;
            }
            else if(count==1) {
                System.out.println("Введите месяц");
                s = sc.nextLine();
                if (s.matches("[1-9]|1[0-2]")) {
                    date.setMonth(Integer.parseInt(s) - 1);
                    cal.set(Calendar.MONTH, Integer.parseInt(s) - 1);
                    count++;
                } else continue;
            }
            else if(count==2) {
                System.out.println("Введите день");
                s = sc.nextLine();
                if (s.matches("[1-9]|[12][0-9]|3[0-1]")) {
                    date.setDate(Integer.parseInt(s));
                    cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(s));
                    count++;
                } else continue;
            }
            else if(count==3) {
                System.out.println("Введите час");
                s = sc.nextLine();
                if (s.matches("[0-9]|1[0-9]|2[0-3]")) {
                    date.setHours(Integer.parseInt(s));
                    cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(s));
                    count++;
                }
            }
            else if(count==4) {
                System.out.println("Введите минуты");
                s = sc.nextLine();
                if (s.matches("0[0-9]|[0-9]|[12345][0-9]")) {
                    date.setMinutes(Integer.parseInt(s));
                    cal.set(Calendar.MINUTE, Integer.parseInt(s));
                    SimpleDateFormat sdf = new SimpleDateFormat("<yyy><MMMM><dd>\n<hh><mm>");
                    System.out.println(sdf.format(cal.getTime()));
                    System.out.println(sdf.format(date.getTime()));
                    count++;
                }
            }

        }
    }
}
