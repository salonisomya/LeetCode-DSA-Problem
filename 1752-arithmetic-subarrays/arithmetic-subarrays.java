class Solution {

    public Boolean check (int[] arr){
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff) return false;
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int n = nums.length;
        int m = l.length;
        for(int i=0;i<m;i++){
            int start = l[i];
            int end = r[i]+1;
            int arr[] = Arrays.copyOfRange(nums, start, end);
           list.add(check(arr));
        } 
        return list;
    }
}