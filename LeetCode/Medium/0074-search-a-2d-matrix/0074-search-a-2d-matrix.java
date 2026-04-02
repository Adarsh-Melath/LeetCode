class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return solution(matrix,target);        
    }

    public static boolean solution(int [][]matrix,int target)
    {
        for(int[] row :matrix )
        {
            if(binarySearch(row,target))
                return true;
        }

        return false;
    }

    public static boolean binarySearch(int[] row,int target)
    {
        int low=0;
        int high=row.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(row[mid]==target)
                return true;
            else if(target>row[mid])
                low=mid+1;
            else high=mid-1;
        }
        return false;
    }    
}