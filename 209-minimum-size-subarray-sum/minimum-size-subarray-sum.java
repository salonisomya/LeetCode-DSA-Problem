class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum =0 ;
        int minlen = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i =0;i<n;i++){
            sum = sum + nums[i];
            while(sum>=target){
                minlen = Math.min(minlen,i-left+1);
                sum = sum- nums[left];
                left++;
            }
        }
        
        return minlen == Integer.MAX_VALUE? 0: minlen;
    }
}