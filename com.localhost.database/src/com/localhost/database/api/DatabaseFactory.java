package com.localhost.database.api;

import com.localhost.database.implementation.InMemoryDatabase;

public class DatabaseFactory {
    public Database getDatabase() {
        return new InMemoryDatabase();
    }
}
