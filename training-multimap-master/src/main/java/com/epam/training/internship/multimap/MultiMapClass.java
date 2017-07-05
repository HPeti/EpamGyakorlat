package com.epam.training.internship.multimap;
import java.util.*;

public class MultiMapClass<K,V> implements  MultiMap<K,V>{
    private Map<K,Set<V>> multimap = new HashMap<K,Set <V>>();
    public V put(K key, V value) {
        Set<V> set;
        if (multimap.containsKey(key))
        {
            set=multimap.get(key);
        }
        else
        {
            set = new HashSet<V>();
            multimap.put(key, set);
        }
        multimap.get(key).add(value);
        return value;

    }

    public Collection<V> get(Object key) {
        return multimap.get(key);
    }

    public Collection<V> remove(K key) {
        Set<V> set = multimap.get(key);
        multimap.remove(key);
        return set;
    }

    public boolean remove(Object key, Object value) {
        if (multimap.get(key).contains(value))
        {
            multimap.get(key).remove(value);
            return true;
        }
        return false;
    }

    public void clear() {
        multimap.clear();
    }

    public boolean containsKey(Object key) {
        return multimap.containsKey(key);
    }

    public boolean containsValue(Object value) {
        for (Map.Entry<K,Set<V>> item : multimap.entrySet())
        {
            if (item.getValue().contains(value))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return multimap.isEmpty();
    }

    public int size() {
        return multimap.size();
    }

}
