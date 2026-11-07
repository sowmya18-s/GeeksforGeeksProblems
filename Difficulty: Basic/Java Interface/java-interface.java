class testClass implements in1 {
    public void display(int k) {
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}