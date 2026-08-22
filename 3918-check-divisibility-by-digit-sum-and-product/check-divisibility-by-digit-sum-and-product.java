class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(temp != 0){
            int rem = temp%10;
            temp = temp/10;
            sum = sum +rem;
            prod = prod * rem;
        }
        int div = sum + prod;
        if(n%div==0){
            return true;
        }
        return false;
    }
}