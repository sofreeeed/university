package ru.mirea.practice4.lab20.task5;

public class Matrix<N extends Number> {
    private N[][] x;
    private N[][] y;

    public Matrix(N[][] x, N[][] y){
        this.x=x;
        this.y = y;
    }

    public  double[][] sum(){
        double[][] c = new double[x.length][x[0].length];
        for(int i=0; i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                c[i][j] = x[i][j].doubleValue() + y[i][j].doubleValue();
            }
        }
        return c;
    }
    public  double[][] substring(){
        double[][] c = new double[x.length][x[0].length];
        for(int i=0; i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                c[i][j] = x[i][j].doubleValue() - y[i][j].doubleValue();
            }
        }
        return c;
    }
    public void display(double[][] t){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.printf("%5.2f",t[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
