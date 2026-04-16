import java.util.Scanner;

class Item {
    int code;
    double price;

    void accept(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item items[] = new Item[5];
        double total = 0;

        
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("Enter details of item " + (i + 1));
            items[i].accept(sc);
        }

        
        System.out.println("\nCode\t\tPrice");
        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        
        System.out.println("\nTotal Price: " + total);
    }
}