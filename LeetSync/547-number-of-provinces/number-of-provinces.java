class Solution {
    public int findCircleNum(int[][] isConnected) {
     int n = isConnected.length;
     int provinces =0;
     boolean[] visited = new boolean[n+1];
     for(int i=0;i<n;i++){
        if(!visited[i]){
            dfs(i,visited,isConnected);
            provinces++;
        }
     } 
     return provinces;
    }

    private void dfs(int i, boolean[] visited, int[][] isConnected){
    visited[i] = true;
    for(int j=0;j<isConnected.length;j++){
        if(isConnected[i][j] == 1 &&  !visited[j]){
            dfs(j,visited,isConnected);
        }
    }
    }
}