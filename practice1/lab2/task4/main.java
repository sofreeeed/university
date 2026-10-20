package ru.mirea.lab2.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int c = 1;
        while (c != 0) {
            String number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество компьютеров: ");
            number = sc.nextLine();
            if (number.matches("^\\d+$")) {
                try {
                    int num = Integer.parseInt(number);
                    if (num > 0 && num < 214748360) {
                        Shop sh = new Shop(num);
                        sh.add_in_shop();
                        sh.display();
                        sh.search();
                        sh.display();
                        sh.del();
                        sh.display();
                        break;
                    } else {
                        System.out.println("Введено неправильное количество компьютеров");
                        continue;
                    }
                }catch (NumberFormatException e) {
                    System.out.println("Число превышает допустимое значение инта");
            }
        }
            else{
                System.out.println("Введены не только числа");
        }

    }
}
}
