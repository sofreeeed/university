package ru.mirea.practice4.lab17.task3;

public class Main {
    public static void main(String[] args){
        Student st = new Student("Pavel", 15);
        Student st1 = new Student("Kirill", 16);
        Student st2 = new Student("Tima", 18);
        CycleSpisok sp = new CycleSpisok();
        sp.addFirst(st);
        sp.addFirst(st);
        sp.sout();
        System.out.println();
        sp.addLast(st1);
        sp.sout();
        System.out.println();
        sp.addIndex(st2,4);
        sp.addIndex(st1,4);
        sp.sout();
        System.out.println();
        sp.removeFirst();
        sp.sout();
        System.out.println();
        sp.removeLast();
        sp.sout();
        System.out.println();
        sp.removeIndex(4);
        sp.sout();
        System.out.println();
        sp.clear();
        if(sp.isEmpty()){
            System.out.println("список пуст");
        }
    }
}
