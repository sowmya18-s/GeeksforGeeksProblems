class Solution {
    public int calcDiff(String s) {
        String[] arr=s.split(" ");
        int ans=0;

        for(String word:arr){
            int v=0,c=0,count=0;
            boolean hard=false;

            for(int i=0;i<word.length();i++){
                char ch=Character.toLowerCase(word.charAt(i));

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                    count=0;
                }
                else{
                    c++;
                    count++;
                    if(count==4){
                        hard=true;
                    }
                }
            }

            if(hard||c>v){
                ans+=5;
            }
            else{
                ans+=3;
            }
        }

        return ans;
    }
}