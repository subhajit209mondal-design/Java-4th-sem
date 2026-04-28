import java.util.Scanner;


interface SalesDepartment {
    void processSale(double amount);
}


interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}


class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale Amount : Rs. " + amount);
        System.out.println("Sale processed successfully.");
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("\nInvoice Generated");
        System.out.println("Client Name : " + clientName);
        System.out.println("Invoice Amount : Rs. " + amount);
    }

    void showSummary() {
        System.out.println("\nSummary:");
        System.out.println("Commercial Executive completed sales and finance tasks successfully.");
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CommercialExecutive ce = new CommercialExecutive();

        System.out.print("Enter Client Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Sale Amount: ");
        double amount = sc.nextDouble();

        System.out.println("\n--- Commercial Work Management System ---");

        ce.processSale(amount);
        ce.generateInvoice(name, amount);
        ce.showSummary();
    }
}