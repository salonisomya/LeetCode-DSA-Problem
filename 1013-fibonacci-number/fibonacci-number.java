class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int sum =0 , fs = 0, ls=1, i=2;
        while(n>=i){
            sum = ls+fs;
            fs = ls;
            ls = sum;
            n--;
        }
        return sum;
    }
}