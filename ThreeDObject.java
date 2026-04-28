import java.util.Scanner;


abstract class ThreeDObject {
    abstract void wholeSurfaceArea();
    abstract void volume();
}


class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void wholeSurfaceArea() {
        double area = 2 * (l * b + b * h + l * h);
        System.out.println("Box Surface Area = " + area);
    }

    void volume() {
        double vol = l * b * h;
        System.out.println("Box Volume = " + vol);
    }
}


class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void wholeSurfaceArea() {
        double area = 6 * side * side;
        System.out.println("Cube Surface Area = " + area);
    }

    void volume() {
        double vol = side * side * side;
        System.out.println("Cube Volume = " + vol);
    }
}


class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void wholeSurfaceArea() {
        double area = 2 * 3.14 * r * (r + h);
        System.out.println("Cylinder Surface Area = " + area);
    }

    void volume() {
        double vol = 3.14 * r * r * h;
        System.out.println("Cylinder Volume = " + vol);
    }
}


class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void wholeSurfaceArea() {
        double l = Math.sqrt(r * r + h * h);
        double area = 3.14 * r * (r + l);
        System.out.println("Cone Surface Area = " + area);
    }

    void volume() {
        double vol = (3.14 * r * r * h) / 3;
        System.out.println("Cone Volume = " + vol);
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        System.out.println("1. Box");
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter Length, Breadth, Height: ");
                obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;

            case 2:
                System.out.print("Enter Side: ");
                obj = new Cube(sc.nextDouble());
                break;

            case 3:
                System.out.print("Enter Radius and Height: ");
                obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
                break;

            case 4:
                System.out.print("Enter Radius and Height: ");
                obj = new Cone(sc.nextDouble(), sc.nextDouble());
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        obj.wholeSurfaceArea();
        obj.volume();
    }
}