class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+"); 
        int n = arr.length;
        String st = "";
        for(int i = n-1;i>=0;i--){
            st = st+arr[i]+" ";
        }
        return st.trim();
    }
}
