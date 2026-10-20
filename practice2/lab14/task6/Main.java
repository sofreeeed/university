package ru.mirea.practice2.lab14.task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String redex = "(\\w+)@(\\w+\\.)(\\w+)";
        Pattern p1 = Pattern.compile(redex);
        Matcher m1 = p1.matcher(s);
        try {
            m1.find();
            if (s.equals(m1.group())) {
                System.out.println("true");
            }
        } catch (IllegalStateException e) {
            System.out.println("нет соотвествий");
        }
    }
}
