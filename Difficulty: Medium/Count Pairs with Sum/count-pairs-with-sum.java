class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        Arrays.sort(arr);
        int count=0;
        int low=0,high=arr.length-1;
        while(low<high){
            int ans=arr[low]+arr[high];
            if(ans==target){
                int c1=0,c2=0;
                int x1=arr[low],x2=arr[high];
                while(low<=high&&arr[low]==x1){
                    c1++;
                    low++;
                }
                while(low<=high&&arr[high]==x2){
                    c2++;
                    high--;
                }
                if(x1==x2){
                    count+=c1*(c1-1)/2;
                }
                else{
                    count+=c1*c2;
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
