class Solution {
    public String minWindow(String s, String t) {
        
        int minlen = Integer.MAX_VALUE;

        int n = s.length();
        int m = t.length();

        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }

        int l =0;
        int r =0;
        int start = 0;
        int count = 0;
        while(r<n){
            char right = s.charAt(r);
            m2.put(right,m2.getOrDefault(right,0)+1);

            if(m1.containsKey(right) && m2.get(right) <= m1.get(right)){
                count ++;
            }

            while(count == m){

                if(minlen > r-l+1){
                    minlen = r-l+1;
                    start = l;
                }


                char left = s.charAt(l);
                m2.put(left,m2.get(left)-1);

                if(m1.containsKey(left) && m2.get(left) < m1.get(left)){
                count --;
                }

                if(m2.get(left) == 0){
                    m2.remove(left);
                }

                l++;
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE) return "";
        return s.substring(start,start+minlen);
    }
}