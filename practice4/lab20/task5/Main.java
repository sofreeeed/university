package ru.mirea.practice4.lab20.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rm = new Random();
        Integer[][] x1 = new Integer[3][3];
        Integer[][] y1 = new Integer[3][3];

        for(int i=0;i< x1.length;i++){
            for(int j=0;j<x1[i].length;j++){
                x1[i][j] = rm.nextInt(-10,10);
                y1[i][j] = rm.nextInt(-10,10);
            }
        }
        var matrix = new Matrix<>(x1,y1);
        System.out.println("первая матрица:");
        for(int i=0;i<x1.length;i++){
            for(int j=0;j<x1[i].length;j++){
                System.out.print(x1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second matrix");
        for(int i=0;i<y1.length;i++){
            for(int j=0;j<y1[i].length;j++){
                System.out.print(y1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("their sum");
        matrix.display(matrix.sum());
        System.out.println("their substring");
        matrix.display(matrix.substring());
     }
}
