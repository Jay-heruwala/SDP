package FactoryPattern.Database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter database name [mysql,mongodb,postgerSQL] : ");
        String dbName = sc.next();
        databaseConnection = Factory.getInstance(dbName);

        if(databaseConnection != null){
            System.out.println("Connect : " + databaseConnection.connect());
            System.out.println("Query : " + databaseConnection.query());
            System.out.println("Connect : " + databaseConnection.disconnect());
        }else {
            System.out.println("Something Want's wrong");
        }



    }
}
