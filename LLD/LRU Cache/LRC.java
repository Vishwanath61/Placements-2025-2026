package lrc;

public class LRC {    
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put("1", "A");
        lru.put("2", "B");
        System.out.println(lru.get("1"));
        lru.put("3", "C");
        System.out.println(lru.get("2"));
    }    
}
