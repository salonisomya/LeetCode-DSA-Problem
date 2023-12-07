class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String s = "";
        int val =-1;
        for(int i=0;i<n-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(num.charAt(i)-'0'>val){
                    val = num.charAt(i)-'0';
                    s = num.substring(i,i+3);
                }
            }
        }
        return s;
    }
}