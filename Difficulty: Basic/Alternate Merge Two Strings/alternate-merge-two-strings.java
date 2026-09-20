class Solution {
    String merge(String s1, String s2) {
        // code here
        String ans="";
        int l=0,r=0;
        int flag=0;
        while(l<s1.length()&&r<s2.length()){
            if(flag==0){
                ans+=s1.charAt(l);
                l++;
                flag=1;
            }
            else{
                ans+=s2.charAt(r);
                r++;
                flag=0;
            }
        }
        while(l<s1.length()){
            ans+=s1.charAt(l);
            l++;
        }
        while(r<s2.length()){
            ans+=s2.charAt(r);
            r++;
        }
        return ans;
    }
}