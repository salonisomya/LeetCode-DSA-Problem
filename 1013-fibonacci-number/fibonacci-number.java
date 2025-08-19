class Solution {
    public int fib(int n) {
        int i =2, sum =0, fsum = 0, lsum = 1;
        if(n<=1)
            return n;
        while(n>=i){
            sum = fsum +lsum;
            fsum = lsum;
            lsum = sum;
            n--;
        }
        return sum;

    }
}