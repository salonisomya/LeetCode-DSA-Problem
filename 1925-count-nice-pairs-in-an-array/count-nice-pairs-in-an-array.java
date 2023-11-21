class Solution {
    public int rev(int val){
       // int val = n;
        int rem =0;
        while(val>0){
            int x = val%10;
            rem = (rem*10) + x;
            val = val/10;
        }
        return rem;
    }
    public int countNicePairs(int[] nums) {
        int count =0;
        int mod = 1000000007;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rev = rev(nums[i]);
            int pair = map.getOrDefault(nums[i]-rev,0);
            map.put(nums[i]-rev,pair+1);
            count = (count+pair)%mod;
        }
        return count;
    }
}