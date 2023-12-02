class Solution {
    public int countCharacters(String[] words, String chars) {
        int count[] = new int[26];
        for(int i=0;i<chars.length();i++){
            count[chars.charAt(i)-'a']++;
        }
        int res =0;
        for(String s:words){
            if(canForm(s,count))
            res = res +s.length();
        }
        return res;
    }

    boolean canForm(String word, int[] counts){
        int c[] = new int[26];
        for(int i=0;i<word.length();i++){
            c[word.charAt(i)-'a']++;
            if(c[word.charAt(i)-'a']>counts[word.charAt(i)-'a']) return false;
        }
        return true;
    }
}