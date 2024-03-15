class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for(int i=0;i<n;i++){
            nums1[m++] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}