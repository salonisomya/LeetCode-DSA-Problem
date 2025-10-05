class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int t = 0;
        for(int i=0;i<n;i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[t];
                nums[t] = temp;
                t++;
            }
        }
    }
}