package com.red30tech.database.api;

import com.red30tech.database.implementation.InMemoryDatabase;

public class DatabaseFactory {
    public Database getDatabase() {
        return new InMemoryDatabase();
    }
}
