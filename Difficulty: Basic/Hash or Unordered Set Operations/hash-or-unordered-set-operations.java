class MySet {
    // Insert an element into the set.
    public void insert(HashSet<Integer> s, int x) {
        s.add(x);
    }

    // Remove an element from the set if it exists.
    public void erase(HashSet<Integer> s, int x) {
        s.remove(x);
    }

    // Return the number of distinct elements in the set.
    public int size(HashSet<Integer> s) {
        return s.size();
    }

    // Return 1 if the element exists; otherwise, return -1.
    public int find(HashSet<Integer> s, int x) {
        if (s.contains(x)) {
            return 1;
        }
        return -1;
    }
}