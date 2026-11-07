class MyMap {
    public void insert(Map<Integer, Integer> mp, int x, int y) {
        // Add or update the key x with value y
        mp.put(x, y);
    }

    public int get(Map<Integer, Integer> mp, int x) {
        // Return value if present, otherwise return -1
        return mp.getOrDefault(x, -1);
    }

    public int size(Map<Integer, Integer> mp) {
        // Return the number of entries in the map
        return mp.size();
    }

    public void remove(Map<Integer, Integer> mp, int x) {
        // Remove key x if it exists
        mp.remove(x);
    }
}