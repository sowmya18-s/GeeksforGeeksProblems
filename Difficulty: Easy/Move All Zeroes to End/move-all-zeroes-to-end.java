class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=0){
                i++;
            }
            if(nums[i]==0&&nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        
    }
}