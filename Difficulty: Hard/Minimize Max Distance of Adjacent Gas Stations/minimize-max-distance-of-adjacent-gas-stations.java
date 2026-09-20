class Solution {
    public int check(int[] nums, double dist){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int diff=nums[i+1]-nums[i];
            int maxplaced=(int)(diff/dist);
            count+=maxplaced;
        }
        return count;
    }
    public double minMaxDist(int[] stations, int k) {
        // code here
        double low=0,high=0;
        for(int i=0;i<stations.length;i++){
            high=Math.max(high,stations[i]);
        }
        double ep=1e-6;
        while((high-low)>ep){
            double mid=(low+high)/2;
            int ans=check(stations,mid);
            if(ans>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
}
