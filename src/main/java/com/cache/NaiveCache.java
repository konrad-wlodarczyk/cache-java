package com.cache;

import java.util.HashMap;

public class NaiveCache<K, V> implements Cache<K, V> {

    private final HashMap<K, V> cache = new HashMap<>();

    @Override
    public void put(K key, V value){
        cache.put(key, value);
    }

    @Override
    public V get(K key){
        return cache.get(key);
    }

    @Override
    public void remove(K key){
        cache.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }
}
