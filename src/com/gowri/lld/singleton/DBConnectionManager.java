package com.gowri.lld.singleton;

public class DBConnectionManager {

    private static DBConnectionManager instance;

    private DBConnectionManager() {}

    public static DBConnectionManager getInstance() {
        if(instance == null) {
            instance = new DBConnectionManager();
        } 

        return instance;
    }
    
}
