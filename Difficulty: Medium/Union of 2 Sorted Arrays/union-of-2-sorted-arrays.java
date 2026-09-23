import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> fahh=new HashSet<>();
        for(int i=0;i<a.length;i++){
            fahh.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            fahh.add(b[i]);
        }
        ArrayList<Integer> fib=new ArrayList<>();
        int i=0;
        for(int x:fahh){
            fib.add(x);
            i++;
        }
        Collections.sort(fib);
        return fib;


    }
}