package ru.mirea.practice4.lab17.task1;

public class Main {
    public static void main(String[] args){
        Student st = new Student();
        Student st1 = new Student();
        Spisok sp = new Spisok();
        if(sp.isEmpty()){
            System.out.println("пустой");
        }else System.out.println("непустой");
        st.add();
        sp.addFirst(st);
        st1.add();
        sp.addFirst(st1);
        sp.addlast(st1);
        sp.sout();
        sp.remove(0);
        sp.sout();
        if(sp.isEmpty()){
            System.out.println("пустой");
        }else System.out.println("непустой");
        sp.empty();
        if(sp.isEmpty()){
            System.out.println("пустой");
        }else System.out.println("непустой");
    }
}
