class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        int w1 = word1.length();
        int w2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while(i<w1 && j<w2){
            char ch = word1.charAt(i);
            sb.append(ch);
            ch = word2.charAt(j);
            sb.append(ch);
            i++;
            j++;
        }
        if(i<w1){
            while(i<w1){
                char ch = word1.charAt(i);
                sb.append(ch);
                i++;
            }
        }
        if(j<w2){
            while(j<w2){
                char ch = word2.charAt(j);
                sb.append(ch);
                j++;
            }
        }
        return sb.toString();
    }
}