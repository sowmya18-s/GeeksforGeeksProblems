class Solution {
    public ArrayList<Integer> queueTraversal(Queue<Integer> q) {
        // Create an ArrayList to store the elements
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through all elements in the queue and add them to the list
        for (Integer val : q) {
            result.add(val);
        }

        return result;
    }
}