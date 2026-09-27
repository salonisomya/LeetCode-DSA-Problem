class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<Integer>[] list = new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            list[i] = new ArrayList<>();
        }

        

        for(int[] e : edges){
            int f = e[0];
            int l = e[1];
            Set<Integer> visited = new HashSet<>();
            if(dfs(f,l,list,visited)){
                return e;
            }
            list[f].add(l);
            list[l].add(f);
        }
        
        return new int[0];

    }
        
    

    boolean dfs(int current, int target, List<Integer>[] list, Set<Integer> visited){

        if(current == target){
            return true;
        }

        visited.add(current);

        for(int next : list[current]){

            if(!visited.contains(next)){

                if(dfs(next, target, list, visited)){
                    return true;
                }
            }
        }

        return false;
    }
}