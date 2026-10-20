package ru.mirea.practice2.lab13.task3;

import java.util.StringTokenizer;

public class Adress {
    private String adressss;
    private String country;
    private String city;
    private String street;
    private String home;
    private String corpus;

    public Adress(String x){
        this.adressss = x;
    }

    public void splited() {
        boolean isWork = false;
        String[] adress = adressss.split(",");
        for (int i = 0; i < adress.length; i++) {
            while (!isWork) {
                if (adress[i].charAt(0) != ' ') {
                    break;
                }
                adress[i] = adress[i].substring(1, adress[i].length());
            }
        }
        this.country = adress[0];
        this.street = adress[2];
        this.city = adress[1];
        this.home = adress[3];
        this.corpus = adress[4];
    }

    public void token(){
        String[] adress = new String[5];
        int count=0;
        StringTokenizer st = new StringTokenizer(adressss, "./");
        while (st.hasMoreTokens()) {
            adress[count] = st.nextToken().trim();
            count++;
        }
        this.country = adress[0];
        this.street = adress[2];
        this.city = adress[1];
        this.home = adress[3];
        this.corpus = adress[4];
    }

    public String toString(){
        return "Страна "+country+" город "+city+" ул."+street+" д."+home+" стр."+corpus;
    }
}

