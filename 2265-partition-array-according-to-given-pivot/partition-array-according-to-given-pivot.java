class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        //int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                for(int j=i;j>0 && nums[j-1]>=pivot;j--){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(nums[i]==pivot){
                for(int j=i;j>0 && nums[j-1]>pivot;j--){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}