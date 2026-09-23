class Solution {
    public void bubbleSort(int[] nums) {
        // code here
        int didswap=0;
        for(int i=nums.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }
}