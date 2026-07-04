class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int numberOfBoomerangs = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];

                int square = x * x + y * y;

                map.put(square, map.getOrDefault(square, 0) + 1);
            }
            for (int k : map.values()) {
                if (k > 1) {
                    numberOfBoomerangs += k * (k - 1);
                }
            }
        }
        return numberOfBoomerangs;
    }
}