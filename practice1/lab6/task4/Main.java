package ru.mirea.lab6.task4;

public class Main {
    public static void main(String[] args){
        Dog dg  = new Dog("stusa", 3,3000);
        Student st = new Student("Ivan", 19, "Промышленная Информатика");

        System.out.println(dg.getName()+ "\n"+st.getName());
    }
}
