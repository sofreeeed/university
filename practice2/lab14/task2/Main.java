package ru.mirea.practice2.lab14.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern p= Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        System.out.println(b);
    }
}
