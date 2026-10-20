package ru.mirea.practice2.lab9.task1;

public class Sort {
    public static void vstvki(Comparable[] list){
        int min;
        int num;
        Comparable temp;
        for(int i=1; i< list.length;i++){
            min = i;
            temp = list[min];
            while(min>0 && list[min-1].compareTo(temp)>0){
                temp = list[min];
                list[min] = list[min -1];
                list[min-1] = temp;
                min--;
            }
        }
    }
}
