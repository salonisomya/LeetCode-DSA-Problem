class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int m = matrix[0].length;
        int n = matrix.length;
        int top =0;
        int left = 0;
        int right = m-1;
        int bottom = n-1;
        while(top<=bottom && left<=right ){
            //traverse right
            for(int i = left ;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            // traverse down 
            for(int i = top ;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            
            //traverse left
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;}
           if(left<=right){
            //traverse up
             for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }}
        return ans;
    }
}