package FactoryPattern.Database;

public class MySQLConnection implements DatabaseConnection{
    @Override
    public String connect() {
        return "Connected to MYSQL";
    }

    @Override
    public String query() {
        return "Execute query at MYSQL";
    }

    @Override
    public String disconnect() {
        return "Disconnected to mysql";
    }
}
