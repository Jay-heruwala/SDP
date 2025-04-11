package FactoryPattern.Database;

public class MongoDBConnection implements DatabaseConnection{
    @Override
    public String connect() {
        return "Connected to MongoDB";
    }

    @Override
    public String query() {
        return "Execute query at MongoDB";
    }

    @Override
    public String disconnect() {
        return "Disconnected to MongoDB";
    }
}
