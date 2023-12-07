class Solution {
    public String largestGoodInteger(String num) {
        
        for(int i=9;i>=0;i--){
            String s = new StringBuilder().append(i).append(i).append(i).toString();
            System.out.println(s);
            if(num.indexOf(s) != -1){
                return s;
            }
        }
        return "";
    }
}