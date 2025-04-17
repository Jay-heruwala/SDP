package ZPracticePrograms.SingletonPattern;

import java.sql.*;


public class DatabaseManager implements Cloneable {
    private static DatabaseManager databaseManager;
    Connection connection;

    private DatabaseManager(){
        try{
            System.out.println("Connection Establish successfully");
        }catch (Exception exception){
            throw new RuntimeException(exception.getMessage());
        }
    }

    public static DatabaseManager getConnectionInstance(){
        if(databaseManager == null){
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
    throw new RuntimeException("Clone are not supported");
    }
}
