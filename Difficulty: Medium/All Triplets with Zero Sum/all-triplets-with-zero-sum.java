class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // code here
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
            for(int j=i+1;j<arr.length;j++){
                int rem=-(arr[i]+arr[j]);
                if(map.containsKey(rem)){
                    for(int k:map.get(rem)){
                        ArrayList<Integer> row=new ArrayList<>();
                        row.add(i);
                        row.add(k);
                        row.add(j);
                        ans.add(row);
                    }
                }
                if(!map.containsKey(arr[j]))
                    map.put(arr[j],new ArrayList<>());
                map.get(arr[j]).add(j);
            }
        }

        return ans;
    }
}