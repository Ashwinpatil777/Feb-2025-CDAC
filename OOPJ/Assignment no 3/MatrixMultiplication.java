import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.println("Enter number of rows of First matrix:");
        int rows1 = sc.nextInt();

        System.out.println("Enter number of columns of First matrix:");
        int cols1 = sc.nextInt();

        // Input dimensions for second matrix
        System.out.println("Enter number of rows of Second matrix (must be " + cols1 + "): ");
        int rows2 = sc.nextInt();

        System.out.println("Enter number of columns of Second matrix:");
        int cols2 = sc.nextInt();

        // Matrix multiplication condition check
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. The number of columns in the first matrix must match the number of rows in the second matrix.");
            return;
        }

        // Declare matrices
        int matrix1[][] = new int[rows1][cols1];
        int matrix2[][] = new int[rows2][cols2];
        int result[][] = new int[rows1][cols2];  // Resultant matrix

        // Input for first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;  // Initialize result cell
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the resultant matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
