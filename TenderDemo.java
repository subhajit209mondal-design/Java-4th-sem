import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void accept(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }

    void display() {
        System.out.println(company + "\t\t" + cost);
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];

        
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("Enter details of Tender " + (i + 1));
            t[i].accept(sc);
        }

        
        System.out.println("\nCompany\t\tCost");
        for (int i = 0; i < 5; i++) {
            t[i].display();
        }
    }
}