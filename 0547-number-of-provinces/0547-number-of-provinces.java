class Solution {
    int[][] graph;
    boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        graph = isConnected;
        int n = graph.length;
        visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int currentCity){
        visited[currentCity]=true;

        for(int nextCity=0;nextCity<graph.length;nextCity++){
            if(!visited[nextCity] && graph[currentCity][nextCity]==1){
                dfs(nextCity);
            }
        }
    }
}