class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int [][]output=new int[intervals.length][2];
        int index=0;

        output[index]=intervals[index];

        for(int i=1;i<intervals.length;i++){
            int lastEnd=output[index][1];

            int start=intervals[i][0];
            int end=intervals[i][1];

            if(start<=lastEnd){
                output[index][1]=Math.max(lastEnd,end);
            }else{
                index++;
                output[index]=intervals[i];
            }
        }
        return Arrays.copyOf(output,index+1);
    }
}