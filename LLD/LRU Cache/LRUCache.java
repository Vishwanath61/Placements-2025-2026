package lrc;

import java.util.*;

class Node {
    String key, value;
    Node prev, next;
    Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    private int capacity;
    private Map<String, Node> cache;
    private Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node("", "");
        tail = new Node("", "");
        head.next = tail;
        tail.prev = head;
    }
    public String get(String key) {
        if(!cache.containsKey(key)) {
            return "Not Found";
        }
        Node node = cache.get(key);
        moveToTail(node);
        return node.value;
    }
    public void put(String key, String value) {
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToTail(node);
        } else {
            if(cache.size() == capacity) {
                Node lru = head.next;
                remove(lru);
                cache.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            insertToTail(newNode);
            cache.put(key, newNode);
        }
    }
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insertToTail(Node node) {
        Node last = tail.prev;
        last.next = node;
        node.prev = last;
        node.next = tail;
        tail.prev = node;        
    }
    private void moveToTail(Node node) {
        remove(node);
        insertToTail(node);
    }
}
