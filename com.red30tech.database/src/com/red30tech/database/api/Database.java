package com.red30tech.database.api;

public interface Database<T> {

    T save(T data);

    T fetchById(String id);

    T update(T data);

    T delete(T data);
}
