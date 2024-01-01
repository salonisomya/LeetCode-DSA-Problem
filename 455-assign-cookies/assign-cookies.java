class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int max = 0;
        int sidx = s.length-1;
        int gidx = g.length - 1;
        
        while(sidx>=0 && gidx>=0){
            if(s[sidx]>=g[gidx]){
                max++;
                sidx--;
                gidx--;
            }
            else{
                gidx--;
            }
        }
        return max;
    }
}