// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int or=n;
        int count=0,pale=0;
        count=(int)Math.log10(n)+1;
        while(n>0){
            int last=n%10;
            n=n/10;
            pale=pale+(int)Math.pow(last,count);
        }
        if(pale==or){
            return true;
        }
        else{
            return false;
        }
    }
}