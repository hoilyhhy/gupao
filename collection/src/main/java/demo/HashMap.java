package demo;


public class HashMap<K,V> implements Map<K,V>{

    private Entry<K,V>[] table = null;
    private int size = 0;
    private static final int defaultLenth=16;

    public HashMap() {
        table = new Entry[defaultLenth];
    }

    public V put(K k, V v) {
        //通过hash算出key值
        int index = hash(k);
        Entry<K,V> entry = table[index];
        if(entry == null){
            table[index] = new Entry<>(k,v,index,null);
            size++;
        }else{
            table[index] = new Entry<>(k,v,index,entry);
            size++;
        }
        return  table[index].getValue();
    }

    private int hash(K k){
        int i = k.hashCode() %(defaultLenth-1);
        return Math.abs(i);//绝对值
    }

    public V get(K k) {
        if(size == 0){
            return  null;
        }
        int index = hash(k);
        Entry<K,V> entry = getEntry(k, index);
        return entry== null ? null : entry.getValue();
    }

    private Entry<K,V> getEntry(K k, int index) {
        for(Entry<K,V> e = table[index]; e != null ; e=e.next){
            if(e.hash == index && (k == e.getKey() || k.equals(e.getKey()))){
                return e;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    class Entry<K,V> implements Map.Entry{

        K k;
        V v;
        int hash;
        Entry<K,V> next;
        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }

        public Entry(K k, V v, int hash, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.hash = hash;
            this.next = next;
        }
    }
}