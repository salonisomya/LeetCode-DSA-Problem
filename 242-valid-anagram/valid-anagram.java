class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length();
        int tn = t.length();
        if(sn != tn ) return false;

        int[] count = new int[26];
        for(int i=0;i<sn;i++){
            count[s.charAt(i) -'a']++;
            count[t.charAt(i) -'a']--;
        }
        for(int c : count){
            if(c!=0) return false;
        }
        return true;
    }
}