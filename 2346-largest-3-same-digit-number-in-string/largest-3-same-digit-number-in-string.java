class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        int sum =-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)== num.charAt(i+2)){
                sum = Math.max(sum,num.charAt(i)-'0');
            }   
        }
        for(int i=0;i<3;i++){
            sb.append((char)(48+sum));
        }
        if(sum == -1) return "";
        else return sb.toString();
    }
}