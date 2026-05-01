class Solution {
    public void sortColors(int[] nums) {

        //Dutch National flag
        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }else if(nums[mid]==1)mid++;
            else {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                low++;
                mid++;
            }
        }

        //count number specifically  but break the constraint
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for (int num : nums) {
        //     if (num == 0) {
        //         count0++;
        //     } else if (num == 1)
        //         count1++;
        //     else count2++;
        // }

        // System.out.println(count0);
        // System.out.println(count1);
        // System.out.println(count2);

        // for(int i=0;i<count0;i++)
        //     nums[i]=0;
        
        // for(int i=count0;i<count0+count1;i++)
        //     nums[i]=1;

        // for(int i=count0+count1;i<nums.length;i++)
        //     nums[i]=2;

        //solution one but break the constraint 
        //  Arrays.sort(nums);
    }
}