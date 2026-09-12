class Solution {
    public boolean isStringExist(String s, String[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            String ss=arr[i];
            if(s.length()==ss.length()&&!ss.equals(s)){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)!=ss.charAt(j)){
                        count++;
                    }
                    
                }
                if(count==1){
                        return true;
                }
            }
        }
        return false;
    }
}