class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] arr=new int[123];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int max=0;
        char count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                count=(char)i;
                max=arr[i];
            }
        }
        return count;
    }
}