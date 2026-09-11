class Solution {
    static int countDistinctPairs(int arr[],int target) {
        Arrays.sort(arr);
        int count=0;
        int low=0,high=arr.length-1;
        while(low<high){
            int ans=arr[low]+arr[high];
            if(ans==target){
                count++;
                int x=arr[low];
                int y=arr[high];
                while(low<high&&arr[low]==x){
                    low++;
                }
                while(low<high&&arr[high]==y){
                    high--;
                }
            }
            else if(ans>target){
                high--;
            }
            else{
                low++;
            }
        }

        return count;
    }
}