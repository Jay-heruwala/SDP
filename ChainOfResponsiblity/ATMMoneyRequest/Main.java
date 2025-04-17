package ChainOfResponsiblity.ATMMoneyRequest;

import ZPracticePrograms.Proxy.FileCreation.FileSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Money value : ");
        double money = scanner.nextDouble();

        if(money%10 == 00){
            RequestedMoney requestedMoney = new RequestedMoney(money);
        }else{
            System.out.println("Money must multiplication of 10");
        }



    }
}
