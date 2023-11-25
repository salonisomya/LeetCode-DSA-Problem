class Solution {
    public int maxIncreaseKeepingSkyline(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++){
                max = Math.max(arr[i][j],max);
            }
            row[i] = max;
        }

        
        for(int j=0; j<m; j++){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                max = Math.max(arr[i][j],max);
            }
            col[j] = max;
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int max = Math.min(row[i],col[j]);
                if(arr[i][j]<max) ans = ans+max-arr[i][j];
            }
        }
        return ans;
    }
}