class Solution {
    public ArrayList<Integer> findMajority(int[] nums) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length/3;
        int cou1=0,cou2=0,ele1=0,ele2=0;
        for(int i=0;i<nums.length;i++){
            if(cou1==0&&nums[i]!=ele2){
                ele1=nums[i];
                cou1=1;
            }
            else if(cou2==0&&nums[i]!=ele1){
                ele2=nums[i];
                cou2=1;
            }
            else if(nums[i]==ele1){
                cou1++;
            }
            else if(nums[i]==ele2){
                cou2++;
            }
            else{
                cou1--;
                cou2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                c1++;
            }
            else if(nums[i]==ele2){
                c2++;
            }
        }
        if(c1>n){
            list.add(ele1);
        }
        if(c2>n){
            list.add(ele2);
        }
        Collections.sort(list);
        return list;
    }
}