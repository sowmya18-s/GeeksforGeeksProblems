class Solution {

    public int check(int[] nums,long pages){
        long ss=0;
        int count=1;

        for(int i=0;i<nums.length;i++){
            if(ss+nums[i]<=pages){
                ss+=nums[i];
            }
            else{
                count++;
                ss=nums[i];
            }
        }

        return count;
    }

    public int findPages(int[] arr,int k){

        if(arr.length<k){
            return -1;
        }

        long low=Integer.MIN_VALUE;
        long high=0;

        for(int i=0;i<arr.length;i++){
            high+=arr[i];
            low=Math.max(low,arr[i]);
        }

        while(low<=high){

            long mid=(low+high)/2;

            int ans=check(arr,mid);

            if(ans<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return (int)low;
    }
}