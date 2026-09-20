class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        Arrays.sort(arr);
        boolean sum=false;
        int low=0,high=arr.length-1;
        while(low<high){
            long ans=(long)arr[low]*arr[high];
            if(ans==target){
                return true;
            }
            else if(ans>target){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}