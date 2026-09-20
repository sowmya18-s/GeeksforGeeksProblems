
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
                boolean sum=false;
                int low=0,high=arr.length-1;
                while(low<high){
                    int ans=arr[low]+arr[high];
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
