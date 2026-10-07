class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0, r=0;

        int max =0;


        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            int hf = 0;
            for(int freq : map.values()){
                hf = Math.max(hf,freq);
            }
            
            while((r-l+1) - hf > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }

            max = Math.max(max, r-l +1);
            r++;
            
            
        }
        return max;
    }
}