class Solution {
    public ArrayList<Integer> twoSum(int[] arr,int target) {
        int low=0,high=arr.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==target){
                list.add(low+1);
                list.add(high+1);
                return list;
            }
            else if(sum>target){
                high--;
            }
            else{
                low++;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
}