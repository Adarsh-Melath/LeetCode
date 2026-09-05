class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
       int i=0;
       int j=1;
    
       while(i<n && j<n)
       {
            if( nums[i]%2==0){
                i+=2;
            }else if(nums[j]%2==1){
                j+=2;
            }else{
                swap(nums,i,j);
            }
       }

       return nums;
    }

    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}