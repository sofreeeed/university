package ru.mirea.practice2.lab13.task6;

import org.w3c.dom.ls.LSOutput;

public class Sort {
    private String[] x;
    private StringBuilder sb = new StringBuilder();

    public Sort(String[] args){
        this.x = args;
    }

    public void sort(){
        if (x == null || x.length == 0) return;

        sb.append(x[0]);

        for(int i = 0; i < x.length - 1; i++) {
            String currentStr = sb.toString();
            String lastWord = currentStr.substring(currentStr.lastIndexOf(" ") + 1);

            char lastChar = lastWord.charAt(lastWord.length() - 1);

            for (int j = 0; j < x.length; j++) {
                if (x[j] != null && !currentStr.contains(x[j])&&isb(x[j])) {
                    char firstChar = x[j].charAt(0);
                    if (lastChar == firstChar) {
                        sb.append(" ").append(x[j]);
                        break;
                    }
                }
            }
        }
        for(int i=0;i<x.length;i++){
            if(!sb.equals(x[i])&&sb.charAt(sb.length()-1)==x[i].charAt(0)){
                sb.append(" ").append(x[i]);
            }
        }
    }

    public boolean isb(String arg){
        if (arg == null || arg.isEmpty()) return false;
        char lastChar = Character.toLowerCase(arg.charAt(arg.length() - 1));

        for(int i = 0; i < x.length; i++){
            if(x[i] != null && !x[i].isEmpty()){
                if(lastChar == Character.toLowerCase(x[i].charAt(0))){
                    return true;
                }
            }
        }
        return false;
    }

    public String getResult() {
        return sb.toString();
    }
}
