class Solution {
    public int[] twoSum(int[] nums, int val) {
        int n = nums.length;
        int s = 0;
        int l = n-1;
        while(s<l){
            int sum = nums[s] + nums[l];
            if(sum == val){
                return new int[]{s+1,l+1};
            }
            System.out.println("sum -- "+sum);
            if (sum > val)
            l--;
            else s++;
            
        }
        return new int[]{};
        
    }
}