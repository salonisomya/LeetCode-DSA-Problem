class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left =0;
        int right = n-1;
        while(left<=right){
            int a = (int)Math.pow(nums[left],2);
            int b = (int)Math.pow(nums[right],2);
            if(a>b){
                ans[n-1] = a;
                left++;
                n--;
            }
            else{
                ans[n-1] = b;
                right--;
                n--;
            }
        }
        return ans;

    }
}