package mirea.lab1;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6};
        double summ = 0;
        for (int j = 0; j < b.length; j++) {
            summ = summ + b[j];
            System.out.print(b[j] + " ");
        }
        System.out.print("\nсумма: "+summ+"\nсреднее арифмитеческое "+summ/b.length);
    }
}
