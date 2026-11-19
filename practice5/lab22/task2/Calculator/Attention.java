package ru.mirea.practice5.lab22.task2.Calculator;

public class Attention {

    public static String nummber(String str, String operation) {
        int index_start = 0;
        String num1 = "";
        String num2 = "";
        String num = "";
        int index_finish = 0;
        while(Bracket.isBracket(str)){
            str=Bracket.search(str);
        }
        int index_oper = str.indexOf(operation);
        if(index_oper!=-1) {
            System.out.println(str);
            for (int i = index_oper - 1; i > -1; i--) {
                String s = str.substring(i, i + 1);
                if (s.matches("[\\d.]")) {
                    num1 = s + num1;
                    index_start = i;
                } else break;
            }
            for (int i = index_oper + 1; i < str.length(); i++) {
                String s = str.substring(i, i + 1);
                if (s.matches("[\\d.]")) {
                    num2 += s;
                    index_finish = i;
                } else break;
            }
            switch (operation) {
                case "*":
                    num = (Double.parseDouble(num1) * Double.parseDouble(num2)) + "";
                    break;
                case "/":
                    num = (Double.parseDouble(num1) / Double.parseDouble(num2)) + "";
                    break;
            }
            return str.substring(0, index_start) + num + str.substring(index_finish + 1);
        }
        return str;
    }

    public static boolean isPreor(String s) {
        if (s.contains("*") || s.contains("/")) {
            return false;
        }
        return true;
    }

    public static String oper(String s) {
        if (s.contains("*")) {
            return "*";
        } else return "/";
    }
}
