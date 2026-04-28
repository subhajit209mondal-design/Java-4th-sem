import java.util.Scanner;

class Item {
    int code;
    double price;

    void accept(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

class ItemArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Item arr[] = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = new Item();

            System.out.println("Enter code of item " + (i + 1) + ":");
            int c = sc.nextInt();

            System.out.println("Enter price of item " + (i + 1) + ":");
            double p = sc.nextDouble();

            arr[i].accept(c, p);
            total = total + p;
        }

        System.out.println("\nCode\tPrice");
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            arr[i].display();
        }

        System.out.println("----------------");
        System.out.println("Total Price = " + total);
    }
}