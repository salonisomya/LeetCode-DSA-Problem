class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
            if(!dfs(i,list,visited)) return false;
        }

        return true;
    }
    boolean dfs(int i, List<Integer>[] list, int[] visited){
        if(visited[i] == 1) return false;
        if(visited[i] == 2) return true;

        visited[i] = 1;
        for(int next : list[i]){
            if(!dfs(next,list,visited)) return false;
        }
        visited[i] =2;

        return true;

    }
}
