package ru.mirea.practice2.lab13.task2;

import java.util.Locale;

public class Person {
    private String lestname;
    private char firstname ;
    private char secondname;

    public Person(String x) {
        String[] fullname = x.split(" ");
        if (fullname.length < 4 && fullname.length > 0) {
            this.lestname = fullname[0];
            if (fullname.length <4) {
                this.firstname = fullname[1].toUpperCase().charAt(0);
            }
            if (fullname.length == 3) {
                this.secondname = fullname[2].toUpperCase().charAt(0);
            }
        }
    }
    public String getFullName(){
        if ((this.firstname !=0) && (this.secondname!=0)){
            return lestname.toUpperCase().charAt(0)+lestname.substring(1,lestname.length()) +" "+firstname+"."+secondname;
        }
        else if((this.firstname !=0) && (this.secondname==0)){
            return lestname.toUpperCase().charAt(0)+lestname.substring(1,lestname.length()) +" "+firstname;
        }
        return lestname.toUpperCase().charAt(0)+lestname.substring(1,lestname.length());
    }
    public String toString(){
        return "Студент "+ getFullName();
    }
}
