class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans = -1;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i : nums){
            if(i%2 == 0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}