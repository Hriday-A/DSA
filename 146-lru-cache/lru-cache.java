class LRUCache {
    HashMap<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;
    class Node{
        int key;
        int value;
        Node next,prev;
        public Node(int key,int value){
            this.key = key;
            this.value= value;
        }
    }
    public LRUCache(int capacity) {
        this.map= new HashMap<>();
        this.capacity= capacity;
        this.head= new Node(-1,-1);
        this.tail= new Node(-1,-1);
        head.next = tail;
        tail.prev= head;
    }
    private void removeNode(Node node){
        node.prev.next= node.next;
        node.next.prev= node.prev;
        node.prev= null;
        node.next= null;
    }
    private void addToHead(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

    }
    
    public int get(int key) {
        if(map.containsKey(key)){
        Node node = map.get(key);
        removeNode(node);
        addToHead(node);
        return node.value;
        } 
        else return -1;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
        Node node = map.get(key);
        node.value=value;
        removeNode(node);
        addToHead(node);
        } 
        else{
            if(map.size()==capacity){
                Node lastNode= tail.prev;
                removeNode(lastNode);
                map.remove(lastNode.key);
            }
            Node node = new Node(key,value);
            addToHead(node);
            map.put(key,node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */