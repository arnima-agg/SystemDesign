package com.example.LLD.singletonpattern;

public class DbConnection {

    //Eager
//    private static DbConnection dbConnection = new DbConnection();
//
//    private DbConnection() {}
//
//    public DbConnection getInstance() {
//        return dbConnection;
//    }

    //lazy
//    private static DbConnection dbConnection;
//    private DbConnection() {}
//
//    public static DbConnection getInstance() {
//        if(dbConnection == null) {
//            dbConnection = new DbConnection();
//        }
//        return dbConnection;
//    }

    //syncronised
//    private static DbConnection dbConnection;
//    private DbConnection() {}
//
//    public synchronized static DbConnection getInstance() {
//        if(dbConnection == null) {
//            dbConnection = new DbConnection();
//        }
//        return dbConnection;
//    }

    //double locking

    private static DbConnection dbConnection;
    private DbConnection() {}

    public static DbConnection getInstance() {
        if(dbConnection == null) {
            synchronized (DbConnection.class) {
                if(dbConnection == null) {
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;

    }

}
