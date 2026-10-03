class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int n = s.length();
        int f = 0;
        int l = 0;

        while(l<n){
        char ch = s.charAt(l);
        
        while(set.contains(ch)){
            set.remove(s.charAt(f));
            f++;
        }
        set.add(ch);  
        
        max = Math.max(max, l-f+1);
        l++;
        }
        return max;
    }

    }
