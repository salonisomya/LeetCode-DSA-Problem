class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += 3 * travel[i];
        }
        
        for (String s : garbage) {
            ans += s.length();
        }
        //System.out.println("ans 2 -- "+ans);
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("G")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
       // System.out.println("ans 3 -- "+ans);
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("P")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
     //   System.out.println("ans 4 -- "+ans);
        for (int i = n - 1; i > 0; i--) {
            if (!garbage[i].contains("M")) {
                ans -= travel[i - 1];
            } else {
                break;
            }
        }
     //   System.out.println("ans 5 -- "+ans);
        return ans;
    }
}