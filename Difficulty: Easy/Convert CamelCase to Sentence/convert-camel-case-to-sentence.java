class Solution {
    public String amendSentence(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i>0&&ch>='A'&&ch<='Z'){
                sb.append(" ");
            }
            sb.append(Character.toLowerCase(ch));
        }
        return sb.toString();
    }
}