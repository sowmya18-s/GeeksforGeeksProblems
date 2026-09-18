class Solution {
    public int check(int[] nums,int pages){
            int ss=0,count=1;
            for(int i=0;i<nums.length;i++){
                if((ss+nums[i])<=pages){
                    ss+=nums[i];
                }
                else{
                    count++;
                    ss=nums[i];
                }
            }
            return count;
        }

    public int splitArray(int[] arr, int k) {
        // code here
        if(arr.length<k){
                    return -1;
                }
                int low=0;
                int high=0;
                for(int i=0;i<arr.length;i++){
                    high+=arr[i];
                    low=Math.max(low,arr[i]);
                }
                while(low<=high){
                    int mid=(low+high)/2;
                    int ans=check(arr,mid);
                    if(ans<=k){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
                return low;
    }
}
