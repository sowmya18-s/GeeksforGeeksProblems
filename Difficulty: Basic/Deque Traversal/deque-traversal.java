class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        // Iterate through the ArrayDeque and print each element followed by a space
        for (Integer val : deq) {
            System.out.print(val + " ");
        }
        // Print a newline at the end as required
        System.out.println();
    }
}