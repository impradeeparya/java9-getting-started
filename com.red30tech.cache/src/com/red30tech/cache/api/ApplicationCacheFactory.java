package com.red30tech.cache.api;

import com.red30tech.cache.implementation.InMemoryCache;

/**
 * @author Pradeep Arya
 */
public class ApplicationCacheFactory {

    public ApplicationCache getCache() {
        return new InMemoryCache();
    }
}
