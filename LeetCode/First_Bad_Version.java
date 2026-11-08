package LeetCode;

import java.util.Random;

public class First_Bad_Version {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(isBadVersion(mid)==false){
                left=mid+1;
            }
            else    right = mid;

        }
        return left;
    }

    public boolean isBadVersion(int n){
        Random rm = new Random();
        int num = rm.nextInt(n);
        if(num<=n){
            return true;
        }
        return false;
    }
}



