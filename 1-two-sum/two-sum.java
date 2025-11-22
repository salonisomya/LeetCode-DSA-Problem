class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        Map <Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            sum = target - nums[i];
            if(map.containsKey(sum)){
                return new int[]{i,map.get(sum)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}