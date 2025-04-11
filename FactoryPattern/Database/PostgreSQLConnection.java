package FactoryPattern.Database;

public class PostgreSQLConnection implements DatabaseConnection{
    @Override
    public String connect() {
        return "Connected to PostgreSQL";
    }

    @Override
    public String query() {
        return "Execute query at PostgreSQL";
    }

    @Override
    public String disconnect() {
        return "Disconnected to PostgreSQL";
    }
}
