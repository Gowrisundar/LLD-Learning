package com.gowri.lld.singleton;

public class DBConnectionManager {

    private static DBConnectionManager dbconnectionManager;

    private DBConnectionManager() {}

    public static DBConnectionManager getInstance() {
        if(dbconnectionManager == null) {
            dbconnectionManager = new DBConnectionManager();
        } 

        return dbconnectionManager;
    }
    
}
