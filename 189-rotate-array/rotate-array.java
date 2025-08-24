class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        ans(nums,0,n-1);
        ans(nums,0,k-1);
        ans(nums,k,n-1);
    }
    int[] ans(int[] nums,int s,int l){
        int temp =0;
        while(s<l){
            temp = nums[s];
            nums[s] = nums[l];
            nums[l] = temp;
            s++;
            l--;
        }
        return nums;
    }
}