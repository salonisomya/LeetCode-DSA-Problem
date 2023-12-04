class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        int n = num.length();
        for(int i = n-1;i>=0;i--){
            int val = num.charAt(i)-'0';
            if(val%2 != 0){
                return num.substring(0,i+1);
            }
        }
       return "";
    }
}