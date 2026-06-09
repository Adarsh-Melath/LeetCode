class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length + 1);

        for (int[] edge : edges) {
            dsu.union(edge[0], edge[1]);
        }

        return dsu.duplicate;
    }
}

class DSU {
    int parent[];
    int size[];
    int duplicate[] = new int[2];

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 1; i < n; i++) {
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

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY){
            duplicate[0]=x;
            duplicate[1]=y;
            return;
        }

        if (size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        } else {
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }
    }
}