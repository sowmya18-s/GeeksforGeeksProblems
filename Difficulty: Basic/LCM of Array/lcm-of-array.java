class Solution {
    public int GCD(int n1, int n2) {
        while(n1>0&&n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
            
        }
        if(n1==0)
            return n2;
        else 
            return n1;
    }
    public int lcmOfArray(int[] a) {
        // code here
        int ans=a[0];
        for(int i=1;i<a.length;i++){
            ans=(ans*a[i]/GCD(ans,a[i]));
        }
        return ans;
    }
}