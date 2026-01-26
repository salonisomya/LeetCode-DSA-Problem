class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max =0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int width = r - l;
            int area = h*width;
            max = Math.max(max,area);
            if(height[l]>height[r]) r--;
            else if(height[l]<height[r]) l++;
            else {
                l++;r--;
            }
        }
        return max;
    }
}