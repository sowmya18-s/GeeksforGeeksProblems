class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        int low=0,high=arr.length-1,target=0;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        while(low<high){
            int sum=arr[low]+arr[high];
            if(sum==target){
                ArrayList<Integer> li=new ArrayList<>();
                li.add(arr[low]);
                li.add(arr[high]);
                list.add(li);
                int x=arr[low];
                int y=arr[high];
                while(low<high&&arr[low]==x){
                    low++;
                }
                while(low<high&&arr[high]==y){
                    high--;
                }
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