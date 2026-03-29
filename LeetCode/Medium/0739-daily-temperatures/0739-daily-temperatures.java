class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return solution(temperatures);
    }

    public static int[] solution(int []temperatures)
    {
        Stack<int[]> stack=new Stack<>();
        int []result=new int [temperatures.length];

        for(int i=0;i<temperatures.length;i++)
        {
            int t=temperatures[i];

            while(!stack.isEmpty()&& t >  stack.peek()[0])
            {
                int []pop=stack.pop();
                result[pop[1]]=i-pop[1];
            }
            stack.push(new int[]{t,i});
        }

        return result;
    }
}