package solution;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Dimensions for Matrix A
        System.out.print("Enter rows and columns for Matrix A: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // 2. Input Dimensions for Matrix B
        System.out.print("Enter rows and columns for Matrix B: ");
        int n2 = sc.nextInt();
        int p = sc.nextInt();

        // 3. Validation: Columns of A must equal Rows of B
        if (n != n2) {
            System.out.println("Error: Matrix multiplication not possible! (Columns of A must equal Rows of B)");
            return;
        }

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] C = new int[m][p];

        // 4. Read Matrix A
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 5. Read Matrix B
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 6. Multiplication using Three Nested Loops
        for (int i = 0; i < m; i++) {       // Rows of A
            for (int j = 0; j < p; j++) {   // Columns of B
                for (int k = 0; k < n; k++) { // Common Dimension
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // 7. Print Resulting Matrix C
        System.out.print("C = ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
        }

        sc.close();
    }
}
