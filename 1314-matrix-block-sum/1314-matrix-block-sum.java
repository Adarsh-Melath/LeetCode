class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] prefix_sum = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix_sum[i][j] = mat[i - 1][j - 1] + prefix_sum[i][j - 1] + prefix_sum[i - 1][j]
                        - prefix_sum[i - 1][j - 1];
            }
        }

        int[][] answer = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int row1 = Math.max((i - k), 0);
            int row2 = Math.min((i + k), rows-1);

            for (int j = 0; j < cols; j++) {
                int col1 = Math.max((j - k), 0);
                int col2 = Math.min((j + k), cols-1);

                answer[i][j] = prefix_sum[row2 + 1][col2 + 1] - prefix_sum[row2 + 1][col1] - prefix_sum[row1][col2 + 1]
                        + prefix_sum[row1][col1];
            }
        }
        return answer;

    }
}