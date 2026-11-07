class MySortedMap {
    public void insert(TreeMap<Integer, Integer> mp, int x, int y) {
        mp.put(x, y);
    }

    public int get(TreeMap<Integer, Integer> mp, int x) {
        return mp.getOrDefault(x, -1);
    }

    public int size(TreeMap<Integer, Integer> mp) {
        return mp.size();
    }

    public void remove(TreeMap<Integer, Integer> mp, int x) {
        mp.remove(x);
    }

    public int getMinKey(TreeMap<Integer, Integer> mp) {
        if (mp.isEmpty()) return -1;
        return mp.firstKey();
    }

    public int getMaxKey(TreeMap<Integer, Integer> mp) {
        if (mp.isEmpty()) return -1;
        return mp.lastKey();
    }
}