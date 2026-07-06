class TimeMap {
    private Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair> pairs = map.get(key);
        if(pairs==null)return"";
        int left = 0;
        int right = pairs.size() - 1;
        Pair result = null;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (pairs.get(mid).getTimestamp() <= timestamp) {
                result = pairs.get(mid);
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return result==null ? "":result.getValue();
    }
}

class Pair {
    private int timestamp;
    private String value;

    public Pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getValue() {
        return value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */