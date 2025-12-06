class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int sum =0;
        int temp = x;
        while(x!=0){
            int dig = x%10;
            sum = sum *10+dig;
            x =x/10;
        }
        if(sum == temp) return true;
        return false;
    }
}