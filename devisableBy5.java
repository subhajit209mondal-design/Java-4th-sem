import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is NOT divisible by 5");
        }

        sc.close();
    }
}