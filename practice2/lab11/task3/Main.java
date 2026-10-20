package ru.mirea.practice2.lab11.task3;

public class Main {
    public static void main(){
        Student st = new Student(7,2,2007);
        try {
            st.fr();
            System.out.println(st);
        }catch(NullPointerException e){
            System.out.println("Ошибка ввода");
        }
    }
}
