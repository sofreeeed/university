package ru.mirea.lab4.task1;

public class Method_with_switc {
    private Seaon_Of_Year season;

    public Method_with_switc(){}

    public void display(Seaon_Of_Year season) {
        switch (season) {
            case Summer:
                System.out.println("Я люблю лето; средняя температура в этом сезоне "+season.getAvgT()+" а также"+season.getDescription());
                break;
            case Winter:
                System.out.println("Я люблю зиму; средняя температура в этом сезоне "+season.getAvgT()+" а также"+season.getDescription());
                break;
            case Spring:
                System.out.println("Я люблю весну; средняя температура в этом сезоне "+season.getAvgT()+" а также"+season.getDescription());
                break;
            case Autumn:
                System.out.println("Я люблю осень; средняя температура в этом сезоне "+season.getAvgT()+" а также"+season.getDescription());
                break;
        }
    }
}
