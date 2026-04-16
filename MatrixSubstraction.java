import java.util.Scanner;

class MatrixSubtraction {
    public static void main(String[] args) {
        int r, c;

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter rows and columns: ");
        r = sc.nextInt();
        c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];

        
        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        
        System.out.println("Resultant matrix (A - B):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}