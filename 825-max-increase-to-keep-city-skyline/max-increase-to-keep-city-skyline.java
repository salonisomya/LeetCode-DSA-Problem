class Solution {
    public int maxIncreaseKeepingSkyline(int[][] arr) {

       int n = arr.length;
       int[] row = new int[n];
       int[] col = new int[n];

       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(row[i]<arr[i][j]) row[i] = arr[i][j];
               if(col[j]<arr[i][j]) col[j] = arr[i][j];
           }
       }

       int ans = 0;
       int min = 0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               min = Math.min(row[i],col[j]);
               if(arr[i][j]<min) ans = ans+(min-arr[i][j]);
           }
       }
       return ans;
    }
}