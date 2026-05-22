class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [][]newIntervals=new int[intervals.length+1][];

        for(int i=0;i<intervals.length;i++){
            newIntervals[i]=intervals[i];
        }
        newIntervals[intervals.length]=newInterval;


        //merge intervals algo
        Arrays.sort(newIntervals,(a,b)->a[0]-b[0]);//O(nlogn)
        int [][]output=new int[newIntervals.length][];//O(n)
        int index=0;
        output[0]=newIntervals[0];

        for(int i=1;i<newIntervals.length;i++){
            int lastEnd=output[index][1];
            int start=newIntervals[i][0];
            int end=newIntervals[i][1];

            if(start<=lastEnd){
                output[index][1]=Math.max(lastEnd,end);
            }else{
                output[++index]=newIntervals[i];
            }
        }


        return Arrays.copyOf(output,index+1);
    }
}