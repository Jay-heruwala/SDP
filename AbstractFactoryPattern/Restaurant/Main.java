package AbstractFactoryPattern.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Country Code : ");
        String countryCode = scanner.next();
        System.out.print("Enter Item Code : ");
        String itemCode = scanner.next();

        String MSG = AbstractFactory.getItem(countryCode,itemCode);
        System.out.println(MSG);
    }
}
