
import java.util.*;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<k;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i], 0)+1);
        }
        ans.add(hs.size());
        for (int j=k;j<arr.length;j++) {
            hs.put(arr[j-k],hs.get(arr[j-k])-1);
            if(hs.get(arr[j-k])==0){
                hs.remove(arr[j-k]);
            }
            hs.put(arr[j],hs.getOrDefault(arr[j],0)+1);
            ans.add(hs.size());
        }
        return ans;
    }
}
