import java.util.Scanner;


abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(int accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdrawal(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHoldersName);
        System.out.println("Address             : " + address);
        System.out.println("Balance             : " + balance);
    }
}


class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String addr, double bal, double roi) {
        super(accNo, name, addr, bal);
        rateOfInterest = roi;
    }

    void withdrawal(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Successful.");
    }

    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        double total = balance + interest;

        System.out.println("Interest Amount : " + interest);
        System.out.println("Total Amount    : " + total);
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String addr = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double roi = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(accNo, name, addr, bal, roi);

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        sa.deposit(dep);

        System.out.print("Enter Withdrawal Amount: ");
        double wd = sc.nextDouble();
        sa.withdrawal(wd);

        sa.display();
        sa.calculateAmount();
    }
}