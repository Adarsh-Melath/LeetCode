class Solution {
    public int makeConnected(int n, int[][] edges) {
        DSU dsu=new DSU(n);

        for(int[]edge:edges){
            dsu.union(edge[0],edge[1]);
        }

        int count=-1;
        for(int i=0;i<dsu.parent.length;i++){
            if(dsu.parent[i]==i){
                count++;
            }
        }
        return dsu.count<count?-1:count;
    }
}

class DSU {
    int[] parent;
    int[] size;
    int count = 0;

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

    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);

        if(rootX==rootY){
            count++;
            return;
        }

        if(size[rootX]<size[rootY]){
            parent[rootX]=rootY;
            size[rootY]+=size[rootX];
        }
        else{
            parent[rootY]=rootX;
            size[rootX]+=size[rootY];
        }
    }

}