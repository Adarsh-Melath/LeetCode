class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int numberOfBoomerangs = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)continue;
                for (int k = 0; k < n; k++) {
                    if(i==k || j==k)continue;

                    int dx1=points[i][0]-points[j][0];
                    int dy1=points[i][1]-points[j][1];
                    int distIJ= dx1*dx1 + dy1*dy1;

                    int dx2=points[i][0]-points[k][0];
                    int dy2=points[i][1]-points[k][1];
                    int distIK= dx2*dx2 + dy2*dy2;

                    if(distIJ==distIK)numberOfBoomerangs++;
                }
            }
        }
        return numberOfBoomerangs;
    }
}