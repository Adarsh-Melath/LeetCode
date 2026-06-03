class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu = new DSU(n);

        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }

        return dsu.find(source) == dsu.find(destination);
    }
}

class DSU {
    int parent[];
    int[] size;

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=i;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);

        return parent[x];
    }

    public void union(int x, int y) {
        int rootOfX = find(x);
        int rootOfY = find(y);

        if (rootOfX == rootOfY) {
            return;
        }

        if (size[rootOfX] < size[rootOfY]) {
            parent[rootOfX] = rootOfY;
            size[rootOfY] += size[rootOfX];
        } else {
            parent[rootOfY] = rootOfX;
            size[rootOfX] += size[rootOfY];
        }
    }
}