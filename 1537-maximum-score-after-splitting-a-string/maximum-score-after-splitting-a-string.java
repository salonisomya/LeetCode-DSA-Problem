class Solution {
    public int maxScore(String s) {
        int c0=0,c1=0;
        int n=s.length();
        int zeroes[]=new int[n];
         int ones[]=new int[n];
          //counting no of zeroes from start of the string 
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
              c0++;
               zeroes[i]=c0;
        } 
              }
             
          //counting no of ones from end of the string 
          for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
              c1++; 
                            ones[i]=c1;
              } 

          }  
          int max=0; 
          for(int i=0;i<n;i++){
              if(i+1<n){
                  max=Math.max(max,zeroes[i]+ones[i+1]);
              }
          }
          return max;
    }
}