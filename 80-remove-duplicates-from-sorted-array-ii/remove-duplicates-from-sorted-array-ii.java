class Solution {
    public int removeDuplicates(int[] nums) {
        int idx =1;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) k++;
            else k=0;
            if(k<=1){
                nums[idx]= nums[i];
                idx++;
            }
        }
        return idx;
    }
}