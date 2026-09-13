class Solution {
    public int modified(String s) {
        //  code here
        int ans=0,count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==s.charAt(i-1)){
                count++;
            }
            else{
                if(count>=3){
                    ans+=(count-1)/2;
                }
                count=1;
            }
        }

            ans+=(count-1)/2;
        
        return ans;
        
    }
}