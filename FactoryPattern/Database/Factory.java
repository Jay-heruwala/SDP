package FactoryPattern.Database;

public class Factory {
    public static DatabaseConnection getInstance(String dbName){
        DatabaseConnection databaseConnection = null;
        
        if(dbName.equalsIgnoreCase("mysql")){
            databaseConnection = new MySQLConnection();
        } else if (dbName.equalsIgnoreCase("mongodb")) {
            databaseConnection = new MongoDBConnection();
        } else if (dbName.equalsIgnoreCase("postgresql")) {
            databaseConnection = new PostgreSQLConnection();
        }else{
            throw new RuntimeException("Invalid database selected");
        }
        return databaseConnection;
    }
}
