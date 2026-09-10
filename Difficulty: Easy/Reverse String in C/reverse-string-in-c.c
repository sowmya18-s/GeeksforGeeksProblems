void reverseString(char str[]) {
    // code here
    int low=0,high=strlen(str)-1;
    while(low<=high){
        char temp=str[low];
        str[low]=str[high];
        str[high]=temp;
        low++;
        high--;
    }
    printf(str);
}