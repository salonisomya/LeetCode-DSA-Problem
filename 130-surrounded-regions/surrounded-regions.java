class Solution {
    
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            // left
            if(board[i][0]=='O'){
                q.add(new int[]{i,0});
                visited[i][0] = true;
            }
            //right
            if(board[i][cols-1]=='O'){
                q.add(new int[]{i,cols-1});
                visited[i][cols-1] = true;
            }
        }
        for(int j=0;j<cols;j++){
            // up
            if(board[0][j]=='O'){
                q.add(new int[]{0,j});
                visited[0][j] = true;
            }
            //down
            if(board[rows-1][j]=='O'){
                q.add(new int[]{rows-1,j});
                visited[rows-1][j] = true;
            }
        }


        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        while(!q.isEmpty()){
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nr >= rows || nc < 0 || nc >= cols) continue;

                if(board[nr][nc] == 'O' && !visited[nr][nc] ){
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
 
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }
}
