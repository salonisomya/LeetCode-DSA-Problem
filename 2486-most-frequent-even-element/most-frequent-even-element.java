class Solution {
    public int mostFrequentEven(int[] nums) {
       // Map<Integer,Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max = -1;
        int ans = -1;
        //for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
               // list.add(entry.getKey());
               max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}