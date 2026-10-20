package ru.mirea.practice2.lab8.task8;

public class Rec {
    private static int c=0;
    public static String recursion(String  s){
        return check(s,0);
    }
    public static String check(String s, int n){
        if(n<s.length()/2 && s.charAt(n)==s.charAt(s.length()-n-1)){
            return check(s,n+1);
        }
        else if(s.charAt(n)!=s.charAt(s.length()-n-1)) return "No";
        return "Yes";
    }
}
