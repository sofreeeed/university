package tbank.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        String s;
        String s1[];
        int number;
        s = sc.nextLine();
        for (int i = 0; i < matrix.length; i++) {
            s = sc.nextLine();
            s1 = s.split(" ");
            for(int j=0;j<s1.length; j++){
                number = Integer.parseInt(s1[j]);
                matrix[i][j] = number;
            }
        }
        int sS=0;
        int sC=0;
        int count=0;
        for(int i=0;i<n;i++){
            sC=0;
            sS=0;
            for(int j=0;j<n;j++){
                sS+=matrix[i][j];
                sC+=matrix[j][i];
                for(int k=0; k<n;k++){
                    
                }
            }
            if(Math.abs(sC-sS)<matrix[i][i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
