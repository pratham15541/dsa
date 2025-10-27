class Node{
    int key, val, freq;
        Node(int k, int v) {
            key = k; val = v; freq = 1;
        }
}

class LFUCache {
    private int capacity;
    private int minFreq;
    private Map<Integer,Node> keyToNode;
    private Map<Integer, LinkedHashSet<Integer>> freqToKeys;

    public LFUCache(int capacity) {
         this.capacity = capacity;
        this.minFreq = 0;
        keyToNode = new HashMap<>();
        freqToKeys = new HashMap<>();
    }
    
    public int get(int key) {
         if (!keyToNode.containsKey(key)) return -1;
          Node node = keyToNode.get(key);
        updateFreq(node);
        return node.val;
    }
    
    public void put(int key, int value) {
         if (capacity == 0) return;

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.val = value;
            updateFreq(node);
            return;
        }

        if (keyToNode.size() == capacity) {
            int evictKey = freqToKeys.get(minFreq).iterator().next();
            freqToKeys.get(minFreq).remove(evictKey);
            keyToNode.remove(evictKey);
        }

        Node node = new Node(key, value);
        keyToNode.put(key, node);
        freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }
    private void updateFreq(Node node) {
        int oldFreq = node.freq;
        freqToKeys.get(oldFreq).remove(node.key);
        if (freqToKeys.get(oldFreq).isEmpty() && oldFreq == minFreq) {
            minFreq++;
        }
        node.freq++;
        freqToKeys.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node.key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */