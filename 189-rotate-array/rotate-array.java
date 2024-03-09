class Solution {

    public int[] ans (int[] nums, int start, int end){
        int temp =0;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
        return nums;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        ans(nums,0,n-1);
        ans(nums,0,k-1);
        ans(nums,k,n-1);
    }

}