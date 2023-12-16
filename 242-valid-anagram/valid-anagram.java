class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length();
        int tn = t.length();
        
        if(sn!=tn) return false;
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }
}