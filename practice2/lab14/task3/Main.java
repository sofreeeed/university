package ru.mirea.practice2.lab14.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "(\\d+)(\\.\\d+)?(\\d+\\s)(USD|RUB|EU)";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
