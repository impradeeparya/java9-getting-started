package com.red30tech.backend;

import com.red30tech.database.api.Database;
import com.red30tech.database.api.DatabaseFactory;

public class Processor {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();
        Database database = databaseFactory.getDatabase();
    }
}
