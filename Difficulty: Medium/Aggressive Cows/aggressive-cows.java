class Solution {
    public boolean Canweplace(int[] nums,int k,int dist){
            int count=1,last=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]-last>=dist){
                    count++;
                    last=nums[i];
                }
            }
            if(count>=k){
                return true;
            }
            return false;
        }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
                int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++){
                    max=Math.max(max,arr[i]);
                    min=Math.min(min,arr[i]);
                }
                int low=1,high=max-min;
                while(low<=high){
                    int mid=(low+high)/2;
                    boolean ans=Canweplace(arr,k,mid);
                    if(ans){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
                return high;
    }
}