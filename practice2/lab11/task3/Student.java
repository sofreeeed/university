package ru.mirea.practice2.lab11.task3;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Student {
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sdf;
    private int day;
    private int month;
    private int year;

    public Student(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
         cal.set(Calendar.DAY_OF_MONTH, day);
         cal.set(Calendar.MONTH, month-1);
         cal.set(Calendar.YEAR, year);
    }

    public Serializable fr(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите как хотите представить дату: короткая, средняя, длинная");
            String s = sc.nextLine();
            if(s.equals("короткая")) {
                sdf = new SimpleDateFormat("E, y-M-d");
                return sdf;
            }
            else if(s.equals("средняя")) {
                sdf = new SimpleDateFormat("E, yyyy-MM-dd");
                return sdf;
            }
            else if(s.equals("длинная")){
                sdf = new SimpleDateFormat("E, yyyy-MMMM-d");
                return sdf;
            }
            return null;
        }

    public String toString(){
        return sdf.format(cal.getTime());
    }
}
