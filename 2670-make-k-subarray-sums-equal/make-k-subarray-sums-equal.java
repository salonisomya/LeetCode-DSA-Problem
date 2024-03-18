class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
       long steps =0; 
        int n = arr.length;
        for(int i=0;i<k;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i;arr[j]!=0;j=(j+k)%n){
                list.add(arr[j]);
                arr[j] =0;
            }
            
             Collections.sort(list);
             for(int val : list){
                steps = steps + Math.abs(val - list.get(list.size()/2));
             }
        }
        return steps;

    }
}