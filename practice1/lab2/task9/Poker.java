package ru.mirea.lab2.task9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    Cards cr=new Cards("q", "3");
    private Cards[] cards=new Cards[5];
    private Cards[] cards_in_game;
    private int players;

    public Poker(int players){
        this.players=players;
        this.cards_in_game=new Cards[(players*5)];
    }


    public void game() {
        int c1=0;
        int c2=0;
        int c3=0;
        String  mast;
        String num;
        while (c2 < players*5) {
            c3=0;
            cr.rmast();
            cr.rnum();
            mast=cr.getMast();
            num=cr.getNumber();

            for(int i=0;i<c2;i++){

                if(cards_in_game[i].getMast().equals(mast) && cards_in_game[i].getNumber().equals(num)) {
                    c3=1;
                    break;
                }
        }
            if(c3==0){
                cards[c1] = new Cards(mast, num);
                cards_in_game[c2] = new Cards(mast, num);
                System.out.println(cards[c1]);
                c1++;
                c2++;
                if(c1==5) {
                    c1=0;
                    System.out.println();
                }
            }


        }
    }
}

