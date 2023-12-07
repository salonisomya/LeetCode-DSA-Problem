class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
       long res = 0;
       int n = arr.length;
        for(int i=0;i<k;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i;arr[j]!=0;j=(j+k)%n){
                list.add(arr[j]);
                arr[j] = 0;
            }
            Collections.sort(list);
            for(int val : list){
                res = res + Math.abs(val-list.get(list.size()/2));
            }
        }
        return res;
    }
}

/* cyclic hai toh % n krenge 
arr[i]==arr[(i+k)%n]
or agar 1 array mai sare element ko kisi 1 element k equal krna hota hai in min operation mai toh -- mid element k equal kr dete hai-- uske liye Math.abs(val-list.get(list.size()/2)); use krenge */