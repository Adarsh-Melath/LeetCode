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
        Pair answer = null;

        if(pairs==null)return ""; 
        int left = 0;
        int right = pairs.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (pairs.get(mid).timestamp <= timestamp) {
                answer = pairs.get(mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer == null ? "" : answer.value;
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