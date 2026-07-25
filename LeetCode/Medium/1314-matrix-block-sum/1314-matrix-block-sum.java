class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] prefix = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = mat[i - 1][j - 1] + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }

        System.out.println(Arrays.deepToString(prefix));

        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int row1 = Math.max(0, i - k);
            int row2 = Math.min(rows - 1, i + k);

            for (int j = 0; j < cols; j++) {
                int col1 = Math.max(0, j - k);
                int col2 = Math.min(cols - 1, j + k);

                answer[i][j] = prefix[row2 + 1][col2 + 1] -prefix[row2 + 1][col1] - prefix[row1][col2 + 1]
                        + prefix[row1][col1];
            }
        }

        return answer;
    }
}