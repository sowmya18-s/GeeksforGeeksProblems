class Solution {
    public static LinkedList < Integer > insertion ( int arr [ ]) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}