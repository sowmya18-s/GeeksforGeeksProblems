class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int count=-1;
                int m=arr.length;
                int n=arr[0].length;
                int c1=0;
                for(int i=0;i<m;i++){
                    int c=0;
                    int low=0,high=n-1;
                    while(low<=high){
                        int mid=(low+high)/2;
                        if(arr[i][mid]==1){
                            high=mid-1;
                        }
                        else{
                            low=mid+1;
                        }
                    }
                    c=n-low;
                    if(c>c1){
                        c1=c;
                        count=i;
                    }
                }
                return count;
    }
};