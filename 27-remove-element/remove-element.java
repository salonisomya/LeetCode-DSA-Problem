class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) {
                k--;

            }
            else{
                nums[s]=nums[i];
                s++;
            }
        }
        return k;
    }
}