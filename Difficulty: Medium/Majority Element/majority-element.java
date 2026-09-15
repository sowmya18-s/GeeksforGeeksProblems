class Solution {
    int majorityElement(int arr[]) {
        // code here
        int count=0;
        int elementt=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                elementt=arr[i];
            }
            else if(arr[i]==elementt){
                count++;
            }
            else{
                count--;
            }
        }
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementt){
                counter++;
            }
            if(counter>arr.length/2){
                return elementt;
            }
        }
        return -1;
        
    }
}