package grokaem_algorithms.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println();
        ArrayList<Integer> x = new ArrayList<>();
        Random rm = new Random();
        Quiksort qs = new Quiksort();
        BinarySearch bs = new BinarySearch();
        for(int i=0; i<10000000; i++){
            x.add(rm.nextInt(1,100000000));
        }

        int searchNumber = x.get(rm.nextInt(10000000));
        x = qs.sort(x);
        double start = System.nanoTime();
        int sr = bs.search(x, searchNumber);
        double end = (System.nanoTime()-start)/1000000;
        System.out.println(searchNumber+"   "+sr+"  "+end);
        start = System.nanoTime();
        for(int i=0;i<x.size();i++){
            if(x.get(i)==searchNumber){
                sr = i;
                break;
            }
        }
        end = (System.nanoTime()-start)/1000000;
        System.out.println(searchNumber+"   "+sr+"  "+end);
    }
}
