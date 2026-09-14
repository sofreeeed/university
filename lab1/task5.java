package mirea.lab1;

import java.util.Scanner;

public class task5 {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int i=0;
        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();
        System.out.print(factorial(i));
    }
}
