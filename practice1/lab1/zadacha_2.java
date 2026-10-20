package mirea.lab1;

import java.util.Scanner;
public class zadacha_2 {
    public static void main(String[] args){
        int q=0;
        int j=0;
        int summ=0;
        int min=1000000000;
        int max=-100000000;
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt();
    if(q==0){
        System.out.print("Массив не может иметь длину 0");
    }
    else {
        int[] m = new int[q];
        do {
            m[j] = sc.nextInt();
            summ += m[j];
            if(min>m[j]){
                min=m[j];
            }
            if(max<m[j]){
                max=m[j];
            }
            j++;
        } while (j < m.length);

        System.out.print("сумма чисел массива: " + summ +"\nминимальное число: "+min+"\nмаксимальное число: "+max);


    }
    }
}
