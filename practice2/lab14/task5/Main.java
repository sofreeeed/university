package ru.mirea.practice2.lab14.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s  = sc.nextLine();
        String regex = "(0[1-9]|[12][0-9]|3[0-2])/(0[1-9]|1[0-2])/(19\\d\\d|[2-9]\\d{3})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        m.find();
        System.out.println(m.group());

    }
}
