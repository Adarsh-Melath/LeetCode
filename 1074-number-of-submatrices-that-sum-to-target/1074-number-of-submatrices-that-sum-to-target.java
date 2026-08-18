class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int top = 0; top < rows; top++) {
            int[] temp = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {
                for (int col = 0; col < cols; col++) {
                    temp[col] += matrix[bottom][col];
                }
                count += subarraySum(temp, target);
            }
        }

        return count;

        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // int[][] prefix_sum = new int[rows + 1][cols + 1];

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= cols; j++) {
        //         prefix_sum[i][j] = matrix[i - 1][j - 1] + prefix_sum[i][j - 1] + prefix_sum[i - 1][j]
        //                 - prefix_sum[i - 1][j - 1];
        //     }
        // }

        // int count = 0;
        // for (int r1 = 0; r1 < rows; r1++) {
        //     for (int c1 = 0; c1 < cols; c1++) {
        //         for(int r2=r1;r2<rows;r2++)
        //         {
        //             for(int c2=c1;c2<cols;c2++)
        //             {
        //                 int sum=prefix_sum[r2+1][c2+1]-prefix_sum[r2+1][c1]-prefix_sum[r1][c2+1]+prefix_sum[r1][c1];

        //                 if(sum==target)count++;
        //             }
        //         }
        //     }
        // }

        // return count;

        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // int count = 0;
        // for (int r1 = 0; r1 < rows; r1++) {
        //     for (int c1 = 0; c1 < cols; c1++) {

        //         for (int r2 = r1; r2 < rows; r2++) {
        //             for (int c2 = c1; c2 < cols; c2++) {
        //                 int sum = 0;

        //                 for (int i = r1; i <= r2; i++) {
        //                     for (int j = c1; j <= c2; j++) {
        //                         sum += matrix[i][j];
        //                     }
        //                 }

        //                 if (sum == target) {
        //                     count++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return count;
    }

    public int subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int prefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            int needed = prefix - target;

            answer += map.getOrDefault(needed, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}