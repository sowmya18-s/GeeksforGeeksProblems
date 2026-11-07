class MySet {
    // Insert an element into the ordered set.
    public void insert(TreeSet<Integer> s, int x) {
        s.add(x);
    }

    // Remove an element from the ordered set if it exists.
    public void erase(TreeSet<Integer> s, int x) {
        s.remove(x);
    }

    // Return the number of distinct elements in the set.
    public int size(TreeSet<Integer> s) {
        return s.size();
    }

    // Return 1 if the element exists; otherwise, return -1.
    public int find(TreeSet<Integer> s, int x) {
        if (s.contains(x)) {
            return 1;
        }
        return -1;
    }
}