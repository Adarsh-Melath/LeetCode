class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int r1 = 0; r1 < rows; r1++) {
            int[] col = new int[cols];
            for (int r2 = r1; r2 < rows; r2++) {
                for (int c1 = 0; c1 < cols; c1++) {
                    col[c1] += matrix[r2][c1];
                }

                count += subarraySum(col, target);
            }
        }
        return count;
    }

    private int subarraySum(int[] col, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefix = 0;
        int answer = 0;

        for (int num : col) {
            prefix += num;

            int needed = prefix - target;

            answer += map.getOrDefault(needed, 0);

            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        return answer;
    }
}