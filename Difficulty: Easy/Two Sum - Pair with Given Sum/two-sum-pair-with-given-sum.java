class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        boolean sum=false;
        int low=0,high=arr.length-1;
        while(low<high){
            int ans=arr[low]+arr[high];
            if(ans==target){
                sum=true;
                return sum;
            }
            else if(ans>target){
                high--;
            }
            else{
                low++;
            }
        }
        return sum;
    }
}