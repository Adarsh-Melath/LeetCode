class TimeMap {
    class Data {
        int timestamp;
        String value;

        Data(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    Map<String, List<Data>> map;

    TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Data(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";

        List<Data> list = map.get(key);
        return binarysearch(list, timestamp);
    }

    public String binarysearch(List<Data> list, int timestamp) {
        int left = 0;
        int right = list.size() - 1;

        String res = "";

        while (left <= right) {
            int mid = (left + right);
            if (list.get(mid).timestamp <= timestamp) {
                res = list.get(mid).value;
                left = mid + 1;
            } else
                right = mid - 1;
        }

        return res;
    }
}