class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstlargest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstlargest){
                secondlargest=firstlargest;
                firstlargest=arr[i];
            }
            else if(arr[i]>secondlargest&&arr[i]!=firstlargest){
                secondlargest=arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE)
            return -1;
        return secondlargest;
    }
}