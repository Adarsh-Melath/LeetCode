class Solution {
    public int makeConnected(int n, int[][] connections) {
        DSU dsu = new DSU(n);

        for (int[] edge : connections) {
            dsu.union(edge[0], edge[1]);
        }

        int components=0;

        for(int i=0;i<n;i++)
        {
            if(dsu.find(i)==i)
            {
                components++;
            }
        }

        int neededCables=components-1;

        return dsu.extraCables >= neededCables ? neededCables :-1;
    }
}

class DSU {
    int parent[];
    int size[];
    int extraCables = 0;

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
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
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            extraCables++;
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