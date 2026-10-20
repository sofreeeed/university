package ru.mirea.lab4.tpart2.task4;

import java.sql.SQLOutput;
import java.util.Random;

public class Matrix {
    Random rm = new Random();
    private double[][][] matrixs = new double[2][][];
    private int col;
    private int str;

    public Matrix(){}

    public void add(int x, int y){
        this.col=y;
        this.str=x;
        for(int count=0; count<matrixs.length;count++){
            matrixs[count] = new double[str][col];
            for (int i = 0; i < matrixs[count].length; i++) {
                for (int j = 0; j < matrixs[count][i].length; j++) {
                    matrixs[count][i][j] = rm.nextInt(30);
                }
            }
        }
        }

    public void display(){
        for(int c=0; c<matrixs.length;c++ ) {
            System.out.println((c+1)+")");
            for (int i = 0; i < matrixs[c].length; i++) {
                for (int j = 0; j < matrixs[c][i].length; j++) {
                    System.out.printf("%4.1f  ", matrixs[c][i][j]);
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }

    public void sum(){
        System.out.println("Матрицa суммы двух матриц: ");
        for(int c=0; c<(matrixs.length-1);c++){
            for(int i=0; i<matrixs[c].length;i++){
                for(int j=0;j<matrixs[c][i].length; j++){
                    System.out.printf("%4.1f  ",(matrixs[c][i][j]+matrixs[c+1][i][j]));
                }
                System.out.println();
            }
        }
    }

    public void proizvedenie(double n){
        System.out.println("Умножение матрицы на число");
        for(int c=0; c<matrixs.length;c++){
            System.out.println((c+1)+")");
            for(int i=0;i<matrixs[c].length;i++){
                for(int j=0; j<matrixs[c][i].length;j++){
                    System.out.printf("%4.1f  ", matrixs[c][i][j]*n);
                }
                System.out.println();
            }
        }
    }

    public void matxmat(){
        System.out.println("Умножение матрицы на матрицу: ");
        for(int c=0; c< (matrixs.length-1);c++){
            for(int i=0;i<matrixs[c].length;i++){
                for(int j =0; j<matrixs[c][i].length;j++){
                    double sum=0;
                    for(int k=0;k<matrixs[c].length;k++) {
                        sum+=(matrixs[c][i][k] * matrixs[c + 1][k][j]);
                    }
                    System.out.printf("%5.1f  ", sum);
                }
                System.out.println();
            }
        }
    }

}
