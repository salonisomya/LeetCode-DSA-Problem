class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int curr = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if (sum == target ) return sum;
                if(Math.abs(sum-target)<Math.abs(curr-target)){
                    curr = sum;
                }
                if(sum > target) r--;
                else l++;
            }
        }
        return curr;

    }
}