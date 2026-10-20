package ru.mirea.lab2.task9;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int players;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Введите количество игроков ");
        players=sc.nextInt();
        if(players!=0) {
            Poker cd = new Poker(players);
            cd.game();
        }
        else System.out.println("Никто не играет");
    }
}
