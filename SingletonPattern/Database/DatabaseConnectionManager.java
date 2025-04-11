package SingletonPattern.Database;

import java.sql.*;

public class DatabaseConnectionManager implements Cloneable {
    private String URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private String username = "root";
    private String password = "Root";
    Connection connection;
    static DatabaseConnectionManager connectionManager ;

    private DatabaseConnectionManager(){
        try{
//            this.connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Connection Successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone(){
        throw new RuntimeException("Sorry, Clone not support");
    }


    public static DatabaseConnectionManager getConnection(){
        if(connectionManager == null){
            connectionManager = new DatabaseConnectionManager();
        }
        return connectionManager;
    }
}
