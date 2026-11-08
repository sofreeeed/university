package grokaem_algorithms.binary;

import java.util.ArrayList;

public class Quiksort {
    public Quiksort(){}

    public ArrayList<Integer> sort(ArrayList<Integer> x){
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> midle = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        if(x.size()<=1){
            return x;
        }
        int mid = x.size()/2;

        for(int i=0;i<x.size();i++){
            if(x.get(i) > x.get(mid)){
                left.add(x.get(i));
            }
            else if(x.get(i)<x.get(mid)){
                right.add(x.get(i));
            }
            else midle.add(x.get(i));
        }
        sort(left);
        sort(right);
        x.clear();
        x.addAll(right);
        x.addAll(midle);
        x.addAll(left);
        return x;
    }
}
