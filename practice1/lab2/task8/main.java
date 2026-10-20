package ru.mirea.lab2.task8;

public class main {
    public static void main(String[] args){
        String[] mas ={"sdsd", "dasda","asdada","eqwer"};
        for(int i=0; i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
        Replace rp = new Replace(mas);
        rp.replace();
        rp.display();
    }
}
