class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];

         List<Integer>[] list = new ArrayList[numCourses];

        for(int i=0; i<numCourses; i++){
            list[i] = new ArrayList<>();
        }
        for(int[] pre : prerequisites){
            int course = pre[0];
            int prereq = pre[1];

            list[course].add(prereq);
        }
        int[] visited = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            if(!dfs(i,list,visited,ans)) return new int[]{};
        }

        return ans;
    }
    int count =0;
    boolean dfs(int i, List<Integer>[] list, int[] visited, int[]ans){
        if(visited[i] == 1) return false;
        if(visited[i] == 2) return true;

        visited[i] = 1;
        for(int next : list[i]){
            if(!dfs(next,list,visited,ans)) return false;
        }
        visited[i] =2;
        ans[count++] = i;

        return true;

    }
}
