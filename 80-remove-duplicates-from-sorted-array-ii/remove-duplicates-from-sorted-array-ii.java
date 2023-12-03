class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0;
        int idx =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) k++;
            else k =0;
            if(k<=1){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}