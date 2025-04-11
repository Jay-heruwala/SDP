package SingletonPattern.Database;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager databaseConnectionManager1 = DatabaseConnectionManager.getConnection();
        DatabaseConnectionManager databaseConnectionManager2 = DatabaseConnectionManager.getConnection();

        System.out.println("DatabaseConnectionManaget 1 : " + databaseConnectionManager1.hashCode());
        System.out.println("DatabaseConnectionManaget 2 : " + databaseConnectionManager2.hashCode());

        DatabaseConnectionManager databaseConnectionManager3 = (DatabaseConnectionManager) databaseConnectionManager1.clone();
    }
}
