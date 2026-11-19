package ru.mirea.practice4.lab17.task2;

public class Main {
    public static void main(String[] args){
        Student st = new Student("Kiselman", 80);
        Student st1 = new Student("Kupcov", 35);
        Student st2 = new Student("Borec", 25);
        Dvusvias sp = new Dvusvias();
        if(sp.isEmpty()){
            System.out.println("пустой");
        }else System.out.println("непустой");
        //st.add();
        //st1.add();
        //st2.add();
        sp.addFirst(st);
        sp.sout();
        System.out.println();
        sp.addFirst(st1);
        sp.sout();
        System.out.println();
        sp.addlast(st1);
        sp.sout();
        System.out.println();
        sp.addIndex(st2,1);
        sp.sout();
        System.out.println();
        sp.remove(3);
        sp.sout();
        System.out.println();
        sp.removeFirst();
        sp.sout();
        System.out.println();
        sp.removeLast();
        sp.sout();
    }
}
