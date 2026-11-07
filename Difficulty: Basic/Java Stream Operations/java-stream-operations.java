import java.util.Arrays;

class Solution {
    public double streamAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(0.0);
    }

    public int streamMin(int[] arr) {
        return Arrays.stream(arr).min().orElse(0);
    }

    public int streamMax(int[] arr) {
        return Arrays.stream(arr).max().orElse(0);
    }

    public int streamSum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}