class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // Create a new ArrayDeque to store the elements
        Deque<Integer> dq = new ArrayDeque<>();

        // Iterate through the input list and add each element to the deque
        for (int num : arr) {
            dq.addLast(num); // or dq.offer(num)
        }

        // Return the populated deque
        return dq;
    }
}