package ru.mirea.lab4.task1;

public class main {
    public static void main(String[] args){
        Seaon_Of_Year season= Seaon_Of_Year.Autumn;
        Method_with_switc sw = new Method_with_switc();

        System.out.printf("Мое любимое время года - %s, %s; средняя температура в этом сезоне - %d\n",season,season.getDescription(),season.getAvgT());

        for(Seaon_Of_Year ss: Seaon_Of_Year.values()){
            sw.display(ss);
        }

        System.out.println("вывод не через метод");
        for(Seaon_Of_Year ss: Seaon_Of_Year.values()){
            System.out.printf("Время года - %s, %s; средняя температура в этом сезоне: %d\n", ss, ss.getDescription(), ss.getAvgT());
        }


    }
}
