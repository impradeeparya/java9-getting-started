package com.red30tech.cache.api;

import java.util.Optional;

/**
 * @author Pradeep Arya
 */
public interface ApplicationCache<K, V> {

    Optional<V> save(K key, V value);

    Optional<V> fetch(K key);

    Optional<V> evict(K key);

}
