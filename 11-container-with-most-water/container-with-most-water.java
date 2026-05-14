class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l<r){
            int width = r-l;
            int length = Math.min(h[l],h[r]);
            int area = length * width;
            ans = Math.max(area,ans);
            if(h[l] < h[r]){
                l++;
            }
            else {
                r--;
            }
        }
        return ans;
    }
}