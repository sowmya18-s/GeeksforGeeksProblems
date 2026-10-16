
import java.util.*;
class Solution {
    public int findMaxAverage(List<Integer> arr,int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr.get(i);
        }
        int s=sum;
        int index=0;
        for(int i=k;i<arr.size();i++){
            sum+=arr.get(i);
            sum-=arr.get(i-k);
            if(sum>s){
                s=sum;
                index=i-k+1;
            }
        }
        return index;
    }
}
