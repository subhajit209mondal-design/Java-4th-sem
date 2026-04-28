import java.util.Scanner;


abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    abstract void display();
}


class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int number, double price, double rate) {
        super(name, number, price);
        discountRate = rate;
    }

    double discount() {
        return (modelPrice * discountRate) / 100;
    }

    void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Car Name       : " + modelName);
        System.out.println("Model Number   : " + modelNumber);
        System.out.println("Price          : " + modelPrice);
        System.out.println("Discount Rate  : " + discountRate + "%");
        System.out.println("Discount Amount: " + discount());
        System.out.println("Final Price    : " + (modelPrice - discount()));
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Model Number: ");
        int number = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Rate (%): ");
        double rate = sc.nextDouble();

        Car c = new Car(name, number, price, rate);
        c.display();
    }
}