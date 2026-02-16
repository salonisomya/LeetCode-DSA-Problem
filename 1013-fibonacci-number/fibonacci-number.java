class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int sum =0,f =0,s=1;
        for(int i=1;i<n;i++){
            sum = f+s;
            f=s;
            s=sum;
        }
        return sum;
    }
}