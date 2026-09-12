class Solution {
    public boolean commonString(String[] s,String[] t) {
        HashSet<String> hs=new HashSet<>();
        for(String x:s){
            hs.add(x);
        }
        for(String x:t){
            if(hs.contains(x)){
                return true;
            }
        }
        return false;
    }
}