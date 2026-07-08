class Solution {
    public int maxPoints(int[][] points) {
        int answer = 1;
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int maxFreq = 0;
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;

                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];

                if (dy == 0) {
                    dx = 1;
                }

                if (dx == 0) {
                    dy = 1;
                }

                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                int gcd = gcd(Math.abs(dx), Math.abs(dy));

                dx /= gcd;
                dy /= gcd;

                String key = dy + "/" + dx;

                int freq = map.getOrDefault(key, 0) + 1;
                map.put(key, freq);
                maxFreq = Math.max(freq, maxFreq);
            }
            answer = Math.max(answer, maxFreq + 1);
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