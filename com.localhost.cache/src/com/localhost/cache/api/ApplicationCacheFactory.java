package com.localhost.cache.api;

import com.localhost.cache.implementation.InMemoryCache;

/**
 * @author Pradeep Arya
 */
public class ApplicationCacheFactory {

    public ApplicationCache getCache() {
        return new InMemoryCache();
    }
}
