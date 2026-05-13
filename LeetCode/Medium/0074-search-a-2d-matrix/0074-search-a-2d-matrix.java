class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
          if( binarySearch(matrix,i,matrix[i].length,target))return true;
        }

        return false; 
    }

    public boolean binarySearch(int[][]matrix,int i,int j,int target){
        
        int left=0;
        int right=j-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(matrix[i][mid]==target){return true;}
            else if(target>matrix[i][mid])left=mid+1;
            else right=mid-1;
        }

        return false;
    }
}