package FactoryPattern.Database;

public interface DatabaseConnection {
    public String connect();
    public String query();
    public String  disconnect();
}
