package com.red30tech.cache.implementation;

import com.red30tech.cache.api.ApplicationCache;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Pradeep Arya
 */
public class InMemoryCache implements ApplicationCache<Integer, String> {

    private Map<Integer, String> cache = new HashMap<>();

    @Override
    public Optional<String> save(Integer key, String value) {
        cache.put(key, value);
        return Optional.ofNullable(value);
    }

    @Override
    public Optional<String> fetch(Integer key) {
        return Optional.ofNullable(cache.get(key));
    }

    @Override
    public Optional<String> evict(Integer key) {
        return Optional.ofNullable(cache.remove(key));
    }
}
