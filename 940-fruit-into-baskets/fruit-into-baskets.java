class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int left = 0;
        for(int i=0; i<n; i++){
           map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

           while(map.size()>2){
            map.put(fruits[left],map.get(fruits[left])-1);
            if((map.get(fruits[left])==0)){
                map.remove(fruits[left]);
            }
            left++;
           }
           sum = Math.max(sum,(i-left+1));

        }
        return sum;
    }
}