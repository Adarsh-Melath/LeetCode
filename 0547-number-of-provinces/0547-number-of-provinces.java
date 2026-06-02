class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        DSU dsu = new DSU(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    dsu.union(i, j);

                }
            }
        }

        return dsu.count;
    }
}

class DSU {
    int[] parent;
    int[] size;
    int count;

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];
        count = n;

        for (int i = 0; i < n; i++) {
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

        count--;
    }
}