class LRUCache {
    //approach 2 : 
    private Map<Integer, Node> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.next = head;
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private Node removeTail(Node node) {
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = val;

            moveToHead(node);
        } else {
            Node newNode = new Node(key, val);

            if (map.size() == capacity) {
                Node lru = removeTail();
                map.remove(lru.key);
            }

            map.put(key,newNode);
            addToHead(newNode);
        }
    }
    //approach 1 : 
    // private LinkedHashMap<Integer, Integer> map;
    // private int capacity;

    // public LRUCache(int capacity){
    //     this.capacity=capacity;
    //     map=new LinkedHashMap(capacity,0.75f, true){
    //         @Override
    //         protected boolean removeEldestEntry(Map.Entry eldest){
    //             return size()>capacity;
    //         }
    //     };
    // }

    // public int get(int key) {
    //    return map.getOrDefault(key, -1);
    // }

    // public void put(int key, int value) {
    //     map.put(key, value);
    // }
}

class Node {
    int key,
    int val;
    Node prev, next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */