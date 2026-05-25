class Solution {
    static class Pair {
        int value;
        int index;

        Pair(int value, int index){
            this.value=value;
            this.index=index;
        }
    }

        public List<Integer> countSmaller(int[] nums) {
            int n = nums.length;

            Pair[] arr = new Pair[n];

            for (int i = 0; i < n; i++) {
                arr[i] = new Pair(nums[i], i);
            }

            System.out.println(arr);

            int[] result = new int[n];

            mergeSort(arr, 0, n - 1, result);

            List<Integer> ans = new ArrayList<>();

            for (int x : result) {
                ans.add(x);
            }

            return ans;
        }

        public void mergeSort(Pair[]arr,int low,int high,int []result){
            if(low>=high)return;

            int mid=low+(high-low)/2;

            mergeSort(arr,low,mid,result);
            mergeSort(arr,mid+1,high,result);

            merge(arr,low,mid,high,result);
        }

        public void merge(Pair[]arr,int low,int mid,int high,int[]result){
            List<Pair> temp=new ArrayList<>();

            int left=low;
            int right=mid+1;
            int rightCount=0;

            while(left<=mid && right<=high){
                if(arr[right].value<arr[left].value){
                    rightCount++;
                    temp.add(arr[right++]);
                }
                else{
                    result[arr[left].index]+=rightCount;
                    temp.add(arr[left++]);
                }
            }

            while(left<=mid){
                result[arr[left].index]+=rightCount;
                    temp.add(arr[left++]);
            }

            while(right<=high){
                 temp.add(arr[right++]);
            }

            for(int i=low;i<=high;i++){
                arr[i]=temp.get(i-low);
            }
        }
}