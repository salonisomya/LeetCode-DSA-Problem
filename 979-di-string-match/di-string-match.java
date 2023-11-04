class Solution {
    public int[] diStringMatch(String s) {
        int i =0;
        int d = s.length();
        int n = s.length();
        int arr[] = new int[n+1];
        for(int j=0;j<n;j++){
            if(s.charAt(j)=='I'){
                arr[j]=i;
                i++;
            }
            else{
                arr[j]=d;
                d--;
            }
        }
        arr[n] = d;
        return arr;
    }
}