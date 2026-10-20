package ru.mirea.practice2.lab8.task1;

public class Rec {
    public static String  treygol(int n){

        if(n==0){
            return "";
        }
        String s = "";
        int count=n;
        for(int i=0;i<count; i++){
            s += n+" ";
        }
        return treygol(n-1)+s;
        }
    }

