class Solution {
    public int removeStones(int[][] stones) {
        int OFFSET=10001;
        DSU dsu=new DSU(20002);

        HashSet<Integer> usedNodes=new HashSet<>();

        for(int[]stone:stones){
            int rowNode=stone[0];
            int colNode=stone[1]+OFFSET;

            dsu.union(rowNode,colNode);

            usedNodes.add(rowNode);
            usedNodes.add(colNode);
        }

        HashSet<Integer> roots=new HashSet<>();
        for(int node:usedNodes){
            roots.add(dsu.find(node));
        }        

        return stones.length-roots.size();
    }
}

class DSU {
    int[] parent;
    int[] size;

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

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
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
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