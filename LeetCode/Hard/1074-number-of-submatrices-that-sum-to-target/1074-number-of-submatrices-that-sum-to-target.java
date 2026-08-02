class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int answer = 0;
        for (int top = 0; top < m; top++) {
            int colSum[]=new int[n];
            for (int bottom = top; bottom < m; bottom++) {
                for(int c=0;c<n;c++){
                    colSum[c]+=matrix[bottom][c];
                }
                answer+=subarraySumEqualsK(colSum,target);
            }
        }
        return answer;
    }

    public int subarraySumEqualsK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int prefix = 0;
        int answer = 0;

        for (int num : arr) {
            prefix += num;

            int needed = prefix - k;
            answer += map.getOrDefault(needed, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return answer;
    }
}