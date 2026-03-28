class Solution {
    public int evalRPN(String[] tokens) {
        return solution(tokens);
    }

     public static int solution(String[] tokens) {
        List<String> list = new ArrayList<>(Arrays.asList(tokens));

        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                String token = list.get(i);

                if ("+-*/".contains(token)) {
                    int a = Integer.parseInt(list.get(i - 2));
                    int b = Integer.parseInt(list.get(i - 1));
                    int result = 0;
                    if (token.equals("+")) {
                        result = a + b;
                    } else if (token.equals("-")) {
                        result = a - b;
                    } else if (token.equals("*")) {
                        result = a * b;
                    } else if (token.equals("/")) {
                        result = a / b;
                    }

                    list.set(i - 2, String.valueOf(result));
                    list.remove(i);
                    list.remove(i - 1);
                    break;
                }
            }
        }

        return Integer.parseInt(list.get(0));
    }
    

}