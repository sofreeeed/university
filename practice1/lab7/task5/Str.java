package ru.mirea.lab7.task5;

public class Str implements LenChet{
    private String strr="";
    private char newstr;
    private char[] ch;

    public void chetlen(String x){
        this.strr = x;
        this.ch = this.strr.toCharArray();
        System.out.println("Было введено "+ strr.length()+" символов");
    }

    public void nechet(){
        for(int i=0; i< this.strr.length(); i++){
            if(i%2==1){
                System.out.print(this.strr.charAt(i));
            }
        }
        System.out.println();
    }

    public void reserve(){
        for(int i=0; i<ch.length/2;i++){
            newstr =ch[i];
            this.ch[i] =ch[ch.length - i - 1];
            ch[ch.length - i - 1] = newstr;
        }
        this.strr = new String(ch);
        System.out.println(this.strr);
    }
}
