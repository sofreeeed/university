package ru.mirea.practice2.lab8.task3;

public class rec {
    public static int recursion(int x, int y){
        if(x<(y-1)){
            x++;
            System.out.println(x);
            return recursion(x,y);
        }
        else if((x-1)>y){
            y++;
            System.out.println(y);
            return recursion(x,y);
        }
        else System.out.println("Числа равны"); return 0;
    }
}
