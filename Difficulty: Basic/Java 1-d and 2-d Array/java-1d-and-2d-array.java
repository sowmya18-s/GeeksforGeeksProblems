class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        int diagonalSum = 0;
        int maxElement = b[0];

        // Calculate left diagonal sum of the 2-d array and find max element in 1-d array
        for (int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
            if (b[i] > maxElement) {
                maxElement = b[i];
            }
        }

        // Add results to the ArrayList to return
        ArrayList<Integer> result = new ArrayList<>();
        result.add(diagonalSum);
        result.add(maxElement);

        return result;
    }
}