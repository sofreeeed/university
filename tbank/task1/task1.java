package tbank.task1;

public class task1 {
    private int sum=0;
    public task1(){}
    public int rec(int n){
        if(n==100){
            return sum+n;
        }
        sum+=n;
        return rec(n-1);
    }
}
