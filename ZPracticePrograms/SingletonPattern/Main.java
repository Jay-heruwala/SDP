package ZPracticePrograms.SingletonPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        DatabaseManager databaseManager1 = DatabaseManager.getConnectionInstance();
        DatabaseManager databaseManager2 = DatabaseManager.getConnectionInstance();

        System.out.println(databaseManager1.hashCode());
        System.out.println(databaseManager2.hashCode());

        DatabaseManager databaseManager3 =(DatabaseManager) databaseManager1.clone();
        System.out.println(databaseManager3.hashCode());

    }
}
