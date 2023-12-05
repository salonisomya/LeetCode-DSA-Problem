class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int val = 0;
        for(int n : nums){
            if(count ==0) val = n;
            if(n==val) count++;
            else count--;
        }
        return val;
    }
}