package com.red30tech.database.api;

import java.util.Optional;

public interface Database<T, K> {

    void init();

    Optional<T> save(K id, T data);

    Optional<T> fetchById(K id);

    Optional<T> update(K id, T data);

    Optional<T> delete(K id);
}
