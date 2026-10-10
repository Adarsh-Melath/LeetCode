class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target);
    }

    private boolean binarySearch(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int col = mid % n;

            int element = matrix[row][col];

            if (element == target)
                return true;
            else if (target<element)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return false;
    }
}