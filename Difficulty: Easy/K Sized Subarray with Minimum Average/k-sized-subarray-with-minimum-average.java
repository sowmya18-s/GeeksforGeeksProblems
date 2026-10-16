class Solution {
    public int leastAvg(int[] arr, int k) {
        // code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int s=sum;
        int index=0;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum<s){
                s=sum;
                index=i-k+1;
            }
        }
        return index+1;
    }
};