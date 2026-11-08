package grokaem_algorithms.binary;

import java.util.ArrayList;

public class BinarySearch {
    public int search(ArrayList<Integer> x, int y){
         int low=0;
         int high = x.size()-1;
         int mid;
         while(low<=high){
             mid =(low+high)/2;
             if(y==x.get(mid)){
                 return mid;
             } else if (y > x.get(mid)) {
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
         return -1;
    }
}
