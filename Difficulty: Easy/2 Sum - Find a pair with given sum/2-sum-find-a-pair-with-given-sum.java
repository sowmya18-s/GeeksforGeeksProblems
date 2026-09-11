class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==target){
                list.add(arr[low]);
                list.add(arr[high]);
                return list;
            }
            else if(sum>target){
                high--;
            }
            else{
                low++;
            }
        }
        return list;
    }
}