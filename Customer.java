import java.util.Scanner;

// Bank Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

// Customer Class
class Customer {
    int custId;
    String custName;

    void getCustomerData(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        custId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        custName = sc.nextLine();
    }

    void displayCustomerData() {
        System.out.println("Customer ID   : " + custId);
        System.out.println("Customer Name : " + custName);
    }
}

// Account Class inherits Customer and implements Bank
class Account extends Customer implements Bank {
    int accNo;
    double balance;

    void getAccountData(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance : " + balance);
    }

    void displayAll() {
        displayCustomerData();
        System.out.println("Account Number : " + accNo);
        displayBalance();
    }
}

// Main Class
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        int choice;
        double amt;

        a.getCustomerData(sc);
        a.getAccountData(sc);

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    amt = sc.nextDouble();
                    a.deposit(amt);
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    amt = sc.nextDouble();
                    a.withdraw(amt);
                    break;

                case 3:
                    a.displayAll();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }
}