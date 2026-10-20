package ru.mirea.practice2.lab13.task1;

import java.util.Locale;

public class MethodString {

    public static void String(String s){
        System.out.println("послдений символ"+s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I love"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace("a","o"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0,s.indexOf("Java"))+s.substring(s.indexOf("Java")+"java".length(), s.length()));
    }
}
