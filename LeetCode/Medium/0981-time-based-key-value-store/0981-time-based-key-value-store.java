class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Pair> list = map.get(key);
        if(list==null)return "";
        int left = 0;
        int right = list.size() - 1;
        Pair answer = null;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).getTimestamp() <= timestamp) {
                answer = list.get(mid);
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return answer!=null?answer.getValue():"";
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