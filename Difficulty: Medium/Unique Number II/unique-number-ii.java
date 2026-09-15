import java.util.*;
class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(Integer it:arr){
            hm.put(it,hm.getOrDefault(it,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> it:hm.entrySet()){
            if(it.getValue()==1){
                list.add(it.getKey());
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}