import java.util.Scanner;


interface Gross {
    void calculateGross();
}


class Employee {
    int empId;
    String empName;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
    }

    void displayEmployeeData() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}


class Salary extends Employee implements Gross {
    double basic, hra, da, grossSalary;

    void getSalaryData(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public void calculateGross() {
        grossSalary = basic + hra + da;
    }

    void displaySalary() {
        displayEmployeeData();
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();

        s.getEmployeeData(sc);
        s.getSalaryData(sc);
        s.calculateGross();

        System.out.println("\n--- Employee Salary Details ---");
        s.displaySalary();
    }
}