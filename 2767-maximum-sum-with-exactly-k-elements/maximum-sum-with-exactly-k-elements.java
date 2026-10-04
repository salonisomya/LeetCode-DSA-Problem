class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        int idx =0;
        for(int i=1; i<n; i++){
            if( nums[i] > max ){
                max = nums[i];
                idx = i;
            }
        }
        int t = 0;
        int sum =0;
        while(t<k){
            sum = sum + max;
            max = max + 1;
            nums[idx] = max;
            t++;
        }
        return sum;
    }
}