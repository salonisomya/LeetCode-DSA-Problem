class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String s ="";
        if(n<3) return "";
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(s.isEmpty()) s = num.substring(i,i+3);

                else if(s.charAt(0)<num.charAt(i))
                s = num.substring(i,i+3);
            }
        }
        return s;
    }
}