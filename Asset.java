import java.util.Scanner;


abstract class Asset {
    String assetName;
    double amount;

    Asset(String name, double amt) {
        assetName = name;
        amount = amt;
    }

    abstract void displayDetails();
}


class Stock extends Asset {
    int shares;

    Stock(String name, double amt, int sh) {
        super(name, amt);
        shares = sh;
    }

    void displayDetails() {
        System.out.println("\n--- STOCK DETAILS ---");
        System.out.println("Asset Name : " + assetName);
        System.out.println("Investment : " + amount);
        System.out.println("Shares     : " + shares);
    }
}


class Bond extends Asset {
    double interestRate;

    Bond(String name, double amt, double rate) {
        super(name, amt);
        interestRate = rate;
    }

    void displayDetails() {
        System.out.println("\n--- BOND DETAILS ---");
        System.out.println("Asset Name     : " + assetName);
        System.out.println("Investment     : " + amount);
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}


class Savings extends Asset {
    double balance;

    Savings(String name, double amt, double bal) {
        super(name, amt);
        balance = bal;
    }

    void displayDetails() {
        System.out.println("\n--- SAVINGS DETAILS ---");
        System.out.println("Asset Name : " + assetName);
        System.out.println("Deposit    : " + amount);
        System.out.println("Balance    : " + balance);
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Asset a;

        // Stock
        a = new Stock("Tata Stock", 50000, 100);
        a.displayDetails();

        // Bond
        a = new Bond("Govt Bond", 30000, 7.5);
        a.displayDetails();

        // Savings
        a = new Savings("SBI Savings", 20000, 25000);
        a.displayDetails();
    }
}