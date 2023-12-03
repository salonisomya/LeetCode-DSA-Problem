class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count =0;
        for(int i=1;i<points.length;i++){
            count = count + helper(points[i-1],points[i]);
        }
        return count;
    }
    int helper (int[] from, int[] to){
        int xdiff = Math.abs(from[0]-to[0]);
        int ydiff = Math.abs(from[1]-to[1]);
        return Math.max(xdiff,ydiff);
    }
}