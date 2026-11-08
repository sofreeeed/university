package LeetCode;

public class task704 {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        int left=0;
        int right=nums.length -1;
        int num = nums[mid];
        while(num!=target && left<=right){
            mid = (left+right)/2;
            num = nums[mid];
            if(num>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(num==target){
            return mid;
        } else{
            return -1;
        }

    }
}
