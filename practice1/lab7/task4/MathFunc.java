package ru.mirea.lab7.task4;

public class MathFunc implements MathCalculable{
   public void pow(double x,int y){
       double c=1;
       for(int i=0; i<y;i++){
           c=c*x;
       }
       System.out.println(x+" в степени "+y+" = "+c);
   }

    public void len(double r){
       System.out.println("Длина окружности = "+r+Pi);
   }

   public void complex(double real, double mnim){
       double z = Math.sqrt(Math.pow(real, 2)+Math.pow(mnim, 2));
       System.out.println("модуль комплексного числа = "+z);
   }
}
