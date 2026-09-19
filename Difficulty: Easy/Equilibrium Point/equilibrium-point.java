class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
           total-=arr[i];
           if(leftsum==total){
             return i;
           }
           leftsum+=arr[i];
        }
        return -1;

    }
}
