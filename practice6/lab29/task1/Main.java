package ru.mirea.practice6.lab29.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        boolean isSim=false;
        List<Integer> way = new ArrayList<>();
        Map<Integer, List<Integer>> hash = new HashMap<>();
        int[][] matrix;
        try {
            int num = sc.nextInt();
            sc.nextLine();
            matrix = new int[num][num];
            String[][] str = new String[num][num];
            for (int i = 0; i < num; i++) {
                String s = sc.nextLine();
                str[i] = s.split(" ");

            }
            for (int i = 0; i < num; i++) {
                way = new ArrayList<>();;
                for (int j = 0; j < num; j++) {
                    matrix[i][j] = Integer.parseInt(str[i][j]);
                    if(matrix[i][j]==1){
                        way.add(j);
                        System.out.println(way);
                        count++;
                    }
                    if(matrix[i][j]!=matrix[j][i]){
                        isSim=true;
                        break;
                    }
                }
                if(isSim){
                    break;
                }
                hash.put(i, way);
            }
            if(count%2==0) {

                System.out.println("количество дорог на планете Нептун - "+ count/2);
            }else System.out.println("такого не может быть");
        }catch(Exception e) {
            System.out.println("что-то сделано неправильно");
        }
    }
}
