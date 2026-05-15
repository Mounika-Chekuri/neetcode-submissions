
class DoubleLinkedList{
    DoubleLinkedList prev;
    int val;
    int key;
    DoubleLinkedList next;
    DoubleLinkedList(int key, int value)
    {
        this.prev = null;
        this.key= key;
        this.val = value;
        this.next = null;
    }
}
class LRUCache {
    private HashMap<Integer,DoubleLinkedList> cache = new HashMap<>();
    DoubleLinkedList head = null, tail = null;
    private int capacity;
    int current_capacity = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        
    }
        private void removeNode(DoubleLinkedList node) {
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (node == head) head = node.next;
        if (node == tail) tail = node.prev;
    }

    private void insertAtHead(DoubleLinkedList node) {
        node.prev = null;
        node.next = head;
        if (head != null) head.prev = node;
        head = node;
        if (tail == null) tail = node;
    }

    private void moveToHead(DoubleLinkedList node) {
        removeNode(node);
        insertAtHead(node);
    }
     private DoubleLinkedList removeTail() {
        DoubleLinkedList node = tail;
        removeNode(tail);
        return node;
    }
    public int get(int key) {
        if(!cache.containsKey(key)) return -1;
        
        DoubleLinkedList node = cache.get(key);
        moveToHead(node);
        return node.val;
    
        }
       
    
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DoubleLinkedList node = cache.get(key);
            node.val = value;
            moveToHead(node);
        } else {
            DoubleLinkedList node = new DoubleLinkedList(key, value);
            cache.put(key, node);
            insertAtHead(node);
            current_capacity++;
            if (current_capacity > capacity) {
                DoubleLinkedList removed = removeTail();
                cache.remove(removed.key);
                current_capacity--;
            }
        }
    }
}


