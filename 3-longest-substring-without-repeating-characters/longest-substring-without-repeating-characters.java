class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int n = s.length();
        int maxlen = 0;

        for(int i= 0; i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                j = Math.max(j,map.get(ch)+1);
            }
            map.put(ch,i);
            maxlen = Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}