class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int lr = 0;
        int hc = col-1;

        while(lr < row){
            if(matrix[lr][0] <= target && target <= matrix[lr][hc]){

                int low = 0;
                int high = col -1;

                while(low<=high){

                    int mid = low + (high-low)/2;
                    if(target == matrix[lr][mid]) return true;

                    else if(target > matrix[lr][mid]) low = mid+1;
                    else high = mid-1;
                }
                //return false;
            }
            lr++;
        }
        return false;
    }
}
