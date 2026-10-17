class Solution {
    public int nthGeekyNumber(int n, int[] geekNum) {
        // code here
        int k=geekNum.length;
        if(n<=k){
            return geekNum[n-1];
        }
        int[] arr=new int[n];
        for(int i=0;i<k;i++){
            arr[i]=geekNum[i];
        }

        for(int i=k;i<n;i++){
            int sum=0;
            for(int j=i-k;j<i;j++){
                sum+=arr[j];
            }
            arr[i]=sum;
        }

        return arr[n-1];
        
    }
}