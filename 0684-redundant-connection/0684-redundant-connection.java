class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;

        DSU dsu=new DSU(n+1);

        for(int[]edge :edges)
        {
            dsu.union(edge[0],edge[1]);
        }

        return dsu.edge;
    }
}

class DSU {
    int[] parent;
    int[] size;
    int[]edge=new int[2];

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i =0; i <n; i++) {
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
            edge[0]=x;
            edge[1]=y;
            return;
        }

        if (size[rootX] < size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        } else {
            parent[rootY] = rootX;
            size[rootX] += size[rootX];
        }
    }
}