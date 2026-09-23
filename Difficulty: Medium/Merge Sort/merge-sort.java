class Solution {
    public void merge(int[] arr, int l,int mid, int r){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=l;
        int right=mid+1;
        while(left<=mid&&right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
    }
    public void ms(int[] arr,int l, int r){
        int mid=(l+r)/2;
        if(l>=r){
            return;
        }
        ms(arr,l,mid);
        ms(arr,mid+1,r);
        merge(arr,l, mid, r);
    }
    void mergeSort(int arr[], int l, int r) {
        ms(arr,0,arr.length-1);

    }
}