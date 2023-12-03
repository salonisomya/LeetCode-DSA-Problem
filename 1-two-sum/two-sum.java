class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int arr[]= new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
               arr[0] = map.get(sum);
               arr[1] = i;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}