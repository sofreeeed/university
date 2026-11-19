package ru.mirea.practice5.lab22.task2.Calculator;

public class Bracket  {
    public static String search(String s) {
        int index_start = 0;
        int index_finish = 0;
        if (isBracket(s)) {
            index_finish = s.indexOf(")");
            for (int i = index_finish - 1; i > 0; i--) {
                String symbol = s.substring(i, i + 1);
                if (symbol.contains("(")) {
                    index_start = i;
                    break;
                }
            }
            return s.substring(0, index_start) + Ravenstvo.ravn_method(s.substring(index_start + 1, index_finish)) + s.substring(index_finish + 1);
        }
        return s;
    }

    public static boolean isBracket(String s){
        if(s.contains("(")){
            return true;
        }
        return false;

    }
}
