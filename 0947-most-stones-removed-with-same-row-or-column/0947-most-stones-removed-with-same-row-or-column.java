class Solution {
    public int removeStones(int[][] stones) {
        DSU dsu=new DSU(stones.length);

        for(int i=0;i<stones.length;i++){
            for(int j=i+1;j<stones.length;j++){
                if(stones[i][0] == stones[j][0] || stones[i][1] ==stones[j][1]){
                    dsu.union(i,j);
                }
            }
        }

        int components =0;

        for(int i=0;i<stones.length;i++){
            if(dsu.find(i)==i){
                components++;
            }
        }

        return stones.length-components;
    }
}

class DSU {
    int[] parent;
    int[] size;

    public DSU(int n){
        parent=new int[n];
        size=new int[n];

        for(int i=0;i<n;i++)
        {
            parent[i]=i;
            size[i]=1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);

        return parent[x];
    }

    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);

        if(rootX==rootY){
            return;
        }

        if(size[rootX]<size[rootY]){
            parent[rootX]=rootY;
            size[rootY]+=size[rootX];
        }
        else{
            parent[rootY]=rootX;
            size[rootX]+=size[rootX];
        }
    }
}