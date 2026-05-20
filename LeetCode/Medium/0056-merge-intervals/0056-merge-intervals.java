class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));

        int[][]output=new int[nums.length][2];

        output[0][0]=nums[0][0];
        output[0][1]=nums[0][1];
        int index=0;

        for(int i=1;i<nums.length;i++){
            int lastEnd=output[index][1];
            int start=nums[i][0];
            int end=nums[i][1];

            if(start<=lastEnd){
                output[index][1]=Math.max(lastEnd,end);
            }else{
                index++;
                output[index]=nums[i];
            }
        }

        return Arrays.copyOf(output,index+1);
    }
}