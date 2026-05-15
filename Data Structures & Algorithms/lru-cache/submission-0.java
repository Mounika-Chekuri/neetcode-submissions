
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
    public int get(int key) {
        if(cache.containsKey(key))
        {
          DoubleLinkedList node = cache.get(key);
         if(node == tail && node != head) tail = tail.prev; 
        if(node != head){
          if(node.next!=null)
             node.next.prev = node.prev;
          if(node.prev!=null)
           node.prev.next = node.next;
           node.next = head;
            head.prev = node;
            head = node;
           
        }
        head.prev = null; 
        return node.val;
    
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(!cache.containsKey(key))
        {
        if(current_capacity==capacity)
        {
            current_capacity--;
            cache.remove(tail.key);
            if(tail.prev == null) {
    tail = null;
    head = null; 
}
            else {
            tail = tail.prev;
            tail.next = null;
            }

        }
        DoubleLinkedList node = new DoubleLinkedList(key,value);
        
        
        if(tail==null)
        {
            tail = node;
        }
        if(head!=null)
        {
        node.next = head;
        head.prev = node;
        }
        head = node;
        cache.put(key, node);
        current_capacity++;
        }
        else 
        {
           DoubleLinkedList node = cache.get(key);
            if(node == tail && node != head) tail = tail.prev; 
           if(node != head) {
            if(node.next!=null)
           node.next.prev = node.prev;
           if(node.prev!=null)
           node.prev.next = node.next;
           
         
           node.next = head;
            head.prev = node;
           
            head = node;
           }
             node.val = value;
             node.prev = null;
            cache.put(key, node);

        }
    }
}
