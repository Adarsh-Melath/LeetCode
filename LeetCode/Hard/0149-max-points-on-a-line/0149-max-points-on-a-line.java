class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int answer = 1;
        for (int i = 0; i < n; i++) {
            int maxF = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if(i==j)continue;
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dy == 0)
                    dx = 1;
                else if (dx == 0)
                    dy = 1;
                else {
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                int gcd = gcd(Math.abs(dy), Math.abs(dx));

                dx /= gcd;
                dy /= gcd;

                String key = dy + "/" + dx;

                int f = map.getOrDefault(key, 0) + 1;
                map.put(key,f);
                maxF = Math.max(maxF, f);

            }
            answer = Math.max(answer, maxF + 1);
        }

        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }
}