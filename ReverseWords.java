import java.util.Scanner;

class ReverseWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        System.out.print("Reversed String: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}