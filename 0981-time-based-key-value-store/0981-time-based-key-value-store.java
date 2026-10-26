class TimeMap {
    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair> pairs = map.get(key);

        if (pairs == null)
            return "";
        Pair pair = null;
        int low = 0;
        int high = pairs.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (pairs.get(mid).timestamp <= timestamp) {
                pair = pairs.get(mid);
                low = mid + 1;
            } else
                high = mid - 1;
        }

        return pair == null ? "" : pair.value;
    }
}

class Pair {
    int timestamp;
    String value;

    public Pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */