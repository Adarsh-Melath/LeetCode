class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        DSU dsu = new DSU(n);

        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }

        return dsu.redundant;
    }
}

class DSU {
    int[] parent;
    int[] size;
    int[] redundant = new int[2];

    public DSU(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x)
            return x;

        parent[x] = find(parent[x]);

        return parent[x];
    }

    public void union(int x, int y){
        int rootOfX=find(x);
        int rootOfY=find(y);

        if(rootOfX==rootOfY){
            redundant[0]=x;
            redundant[1]=y;
            return;
        }

        if(size[rootOfX]<size[rootOfY]){
            parent[rootOfX]=rootOfY;
            size[rootOfY]+=size[rootOfY];
        }else{
            parent[rootOfY]=rootOfX;
            size[rootOfX]+=size[rootOfY];
        }
    }
}