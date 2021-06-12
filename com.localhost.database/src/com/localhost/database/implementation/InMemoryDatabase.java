package com.localhost.database.implementation;

import com.localhost.cache.api.ApplicationCache;
import com.localhost.cache.api.ApplicationCacheFactory;
import com.localhost.database.api.Database;

import java.util.Optional;

public class InMemoryDatabase implements Database<String, Integer> {

    private ApplicationCache<Integer, String> applicationCache;
    private ApplicationCacheFactory applicationCacheFactory = new ApplicationCacheFactory();

    @Override
    public void init() {
        applicationCache = applicationCacheFactory.getCache();
    }

    @Override
    public Optional<String> save(Integer id, String data) {
        return applicationCache.save(id, data);
    }

    @Override
    public Optional<String> fetchById(Integer id) {
        Optional<String> dbValue;
        if (applicationCache.fetch(id).isPresent()) {
            dbValue = applicationCache.fetch(id);
        } else {
            dbValue = Optional.empty();
        }
        return dbValue;
    }

    @Override
    public Optional<String> update(Integer id, String data) {
        return applicationCache.save(id, data);
    }

    @Override
    public Optional<String> delete(Integer id) {
        return applicationCache.evict(id);
    }
}
