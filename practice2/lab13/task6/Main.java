package ru.mirea.practice2.lab13.task6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] l;
        String name = "C:/Users/leoni/IdeaProjects/lab1/src/ru/mirea/practice2/lab13/task6/txt1.txt";
        try (BufferedReader read = new BufferedReader(new FileReader(name))) {
            String line = read.readLine();
            l = line.split(" ");
            String[] l2 = new String[l.length];
            for(int i=0;i<l.length;i++){
                l2[i] = new String(l[i]);
            }
            Sort sr = new Sort(l2);
            sr.sort();
            System.out.println(sr.getResult());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }

        
    }
}
