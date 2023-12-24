class Solution {
    public int minOperations(String s) {
        int count0 =0; 
        int count1 =0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]=='0') count1++;
                else count0++;
            }
            else{
                if(arr[i]=='1') count1++;
                else count0++;
            }
        }
            return Math.min(count0,count1);
        }
        
    }
