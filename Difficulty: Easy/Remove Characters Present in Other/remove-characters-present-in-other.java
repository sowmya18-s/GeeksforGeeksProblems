class Solution {
    public String removeChars(String s1,String s2) {
        boolean[] arr=new boolean[26];
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!arr[ch-'a']){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}