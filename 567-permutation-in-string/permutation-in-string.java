class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        int l=0;
        int r=0;
        for(int i=0;i<m;i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1); 

            if(i-l+1 > n){
                map2.put(s2.charAt(l),map2.get(s2.charAt(l))-1);
                if(map2.get(s2.charAt(l)) == 0){
                    map2.remove(s2.charAt(l));
                }
                l++;

            } 

            if(i-l+1 == n){
                if(map1.equals(map2)) return true;
            }

        }
        return false;
    }
}
