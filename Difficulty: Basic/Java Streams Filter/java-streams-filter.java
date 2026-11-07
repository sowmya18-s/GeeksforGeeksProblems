import java.util.Arrays;

class Solution {
    public static int filterUsingStreams(int[] arr) {
        return Arrays.stream(arr)
                     .filter(n -> n % 2 != 0)
                     .max()
                     .orElse(0);
    }
}