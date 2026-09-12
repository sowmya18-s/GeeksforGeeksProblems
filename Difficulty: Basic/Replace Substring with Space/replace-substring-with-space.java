class Solution {
    public String extractMessage(String s) {
        // code here
        char[] arr=s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(i+2<s.length()&&arr[i]=='L'&&arr[i+1]=='I'&&arr[i+2]=='E'){
                if(j>0&&arr[j-1]!=' '){
                    arr[j++]=' ';
                }
                i+=2;
            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        return new String(arr,0,j);
    }
}