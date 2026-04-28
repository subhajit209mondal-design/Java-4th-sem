import java.util.Scanner;


abstract class AbstractProduct {
    int product_id;
    String title;
    double price;

    AbstractProduct(int id, String t, double p) {
        product_id = id;
        title = t;
        price = p;
    }

    abstract void inputData();
    abstract void displayData();
}


class TravelGuide extends AbstractProduct {
    String author;
    String place;

    TravelGuide(int id, String t, double p) {
        super(id, t, p);
    }

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Place Name: ");
        place = sc.nextLine();
    }

    void displayData() {
        System.out.println("\n--- TRAVEL GUIDE BOOK ---");
        System.out.println("Product ID : " + product_id);
        System.out.println("Title      : " + title);
        System.out.println("Price      : " + price);
        System.out.println("Author     : " + author);
        System.out.println("Place      : " + place);
    }
}


class CD extends AbstractProduct {
    String singer;
    int duration;

    CD(int id, String t, double p) {
        super(id, t, p);
    }

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Singer Name: ");
        singer = sc.nextLine();

        System.out.print("Enter Duration (minutes): ");
        duration = sc.nextInt();
    }

    void displayData() {
        System.out.println("\n--- CD DETAILS ---");
        System.out.println("Product ID : " + product_id);
        System.out.println("Title      : " + title);
        System.out.println("Price      : " + price);
        System.out.println("Singer     : " + singer);
        System.out.println("Duration   : " + duration + " mins");
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Travel Guide Input
        System.out.println("Enter Travel Guide Details:");
        System.out.print("Enter Product ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        TravelGuide tg = new TravelGuide(id1, title1, price1);
        tg.inputData();

        // CD Input
        System.out.println("\nEnter CD Details:");
        System.out.print("Enter Product ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        CD cd = new CD(id2, title2, price2);
        cd.inputData();

        // Display
        tg.displayData();
        cd.displayData();
    }
}