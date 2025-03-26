import java.util.Scanner;

class DiagonalSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter N (size of square matrix): ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
		int mainDiagonal = 0;
		int SecondaryDiagonal=0;
		
		 
		for (int i =0 ; i < n; i++){
			mainDiagonal += matrix[i][i];
			SecondaryDiagonal +=matrix[i][n - i - 1];
			 System.out.print(matrix[i][i] + " ");
		}
		
		
			 System.out.println("Sum of main diagonal: " + mainDiagonal);
        System.out.println("Sum of secondary diagonal: " + SecondaryDiagonal);
        System.out.println("Total sum of both diagonals: " + (mainDiagonal + SecondaryDiagonal));
		
	}
}