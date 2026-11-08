package ru.mirea.practice4.lab22.task1;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args){
        Stack<Integer> num = new Stack<>();
        Stack<String> oper  = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String q;
        int isWork=0;
        for(int i=0; i<s.length();i++){
             q = s.substring(i,i+1);
            if(q.matches("[0-9]")){
                num.push(Integer.parseInt(q));
            }
            else if(q.matches("[*/+-]")){
                try{
                    int y = num.peek();
                    num.pop();
                    int x = num.peek();
                    num.pop();
                    switch(q){
                        case "+":num.push(x+y);break;
                        case "-":num.push(x-y);break;
                        case "*":num.push(x*y);break;
                        case "/":num.push(x/y);break;
                    }
                }catch (Exception e){
                    System.out.println("ошибка");
                }
            }else{
                isWork=1;
                System.out.println("ошибка ввода");
            }
        }
        if(isWork!=1) {
            System.out.println(num.peek());
        }
    }
}
