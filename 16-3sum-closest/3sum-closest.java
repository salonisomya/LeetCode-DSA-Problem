class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int curr = nums[0] + nums[1] + nums[2];
        for(int i =0;i<n;i++){
            int l = i+1;
            int k = n-1;
            while(l<k){
                int sum = nums[i]+nums[l]+nums[k];
                if(sum == target) return sum;
                else if(Math.abs(sum - target) < Math.abs(curr - target)){
                    curr = sum;
                }
                if(sum < target ) l++;
                else k--;
            }
        }
        return curr;
    }
}