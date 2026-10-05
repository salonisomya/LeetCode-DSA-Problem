class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        long max =0;
        long sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            sum = sum + arr[i];
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        if(k == map.size()){
            max = sum;
        }


        for(int i=k; i<n; i++){

            sum = sum + arr[i];
            sum = sum - arr[i-k];

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k],map.get(arr[i-k]) - 1);

            if(map.get(arr[i-k]) == 0){
                map.remove(arr[i-k]);
            }

            if(map.size() == k){
                max = Math.max(sum,max);
            }
            
        }
        return max;
    }
}