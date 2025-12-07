class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum = target - nums[i];
            if(map.containsKey(sum)){
                return new int[]{i,map.get(sum)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}