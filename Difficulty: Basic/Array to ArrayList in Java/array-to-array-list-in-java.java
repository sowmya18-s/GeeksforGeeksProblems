class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Create a new ArrayList to store the elements
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate through the given array and add each element to the ArrayList
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // Return the populated ArrayList
        return list;
    }
}