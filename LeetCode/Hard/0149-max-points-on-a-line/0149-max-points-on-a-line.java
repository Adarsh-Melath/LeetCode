class Solution {
    public int maxPoints(int[][] points) {
        int answer = 1;
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int max = 0;
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dy == 0)
                    dx = 1;
                else if (dx == 0)
                    dy = 1;
                if (dx < 0) {
                    dy = -dy;
                    dx = -dx;
                }

                int gcd = gcd(Math.abs(dy), Math.abs(dx));
                dy /= gcd;
                dx /= gcd;
                String key = dy + "/" + dx;
                map.put(key, map.getOrDefault(key, 0) + 1);
                max = Math.max(max, map.getOrDefault(key, 0));
            }
            answer = Math.max(max+1, answer);
        }
        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}