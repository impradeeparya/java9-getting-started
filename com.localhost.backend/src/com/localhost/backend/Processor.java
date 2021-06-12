package com.localhost.backend;

import com.localhost.database.api.Database;
import com.localhost.database.api.DatabaseFactory;

public class Processor {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();
        Database database = databaseFactory.getDatabase();
        database.init();
        database.save(1, "One");

        System.out.println("value present in database " + database.fetchById(1).get());
        database.delete(1);
        System.out.println("value present in database after delete " + database.fetchById(1).get());
    }
}
