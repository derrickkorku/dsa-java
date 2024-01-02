import java.security.Key;
import java.util.LinkedList;
class Entry<K, V>{
    K key;
    V value;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

}

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;

    public MyHashMap(){
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity){
        this.buckets = new LinkedList[capacity];
        this.size = 0;
    }

    public void put(K key, V value){
        if (key == null){
            throw new IllegalArgumentException("Key can not be null");
        }

        int index = this.index(key);

        if (this.buckets[index] != null){
            for (Entry<K, V> entry : this.buckets[index]){
                if (entry.key.equals(key)){
                    entry.value = value;
                    return;
                }
            }
        }

        this.buckets[index] = new LinkedList<>();
        this.buckets[index].add(new Entry<>(key, value));
        this.size++;

        if ( (1.0 * this.size) / this.buckets.length > 0.75){
            this.resizeTable();
        }
    }

    private void resizeTable(){
        LinkedList<Entry<K, V>>[] oldTable = this.buckets;
        this.buckets = new LinkedList[oldTable.length * 2];

        this.size = 0;

        for (LinkedList<Entry<K, V>> bucket: oldTable){
            if (bucket != null){
                for (Entry<K, V> entry: bucket){
                    this.put(entry.key, entry.value);
                }
            }
        }
    }

    public V get(K key){
        int index = this.index(key);

        if (this.buckets[index] != null){
            for (Entry<K, V> entry : this.buckets[index]){
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }
        }

        return null;
    }

    public void remove(K key){
        int index = this.index(key);
        if (this.buckets[index] != null){
            for (Entry<K, V> entry : this.buckets[index]){
                if (entry.key.equals(key)){
                    this.buckets[index].remove(entry);
                    this.size--;
                }
            }
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private int index(K key){
        return key.hashCode() % this.buckets.length;
    }
}
