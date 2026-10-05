class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }

        List<Integer> list = new ArrayList<>();

        for(int n : set1){
            if(set1.contains(n) && set2.contains(n)){
                list.add(n);
            }
        }
        int[] arr = new int[list.size()];
        int i =0;
        for(int n : list){
            arr[i] = n;
            i++;
        }
        return arr;

    }
}