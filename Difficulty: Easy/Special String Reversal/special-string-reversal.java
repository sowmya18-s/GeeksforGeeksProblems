class Solution {
    public String reverseString(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        int low=0,high=s.length()-1;
        while(low<high){
            if(!Character.isLetter(s.charAt(low))){
                low++;
            }
            else if(!Character.isLetter(s.charAt(high))){
                high--;
            }
            else{
                char temp=sb.charAt(low);
                sb.setCharAt(low,s.charAt(high));
                sb.setCharAt(high,temp);
                low++;
                high--;
            }
        }
        return sb.toString();
    }
}