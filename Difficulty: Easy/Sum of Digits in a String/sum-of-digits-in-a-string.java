class Solution {
    public String arrangeString(String s) {
        int[] arr=new int[26];
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='A'&&ch<='Z'){
                arr[ch-'A']++;
            }
            else{
                sum+=ch-'0';
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            while(arr[i]>0){
                sb.append((char)(i+'A'));
                arr[i]--;
            }
        }
        if(sum>0){
            sb.append(sum);
        }
        return sb.toString();
    }
}