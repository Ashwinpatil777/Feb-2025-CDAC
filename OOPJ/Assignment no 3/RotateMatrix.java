import java.util.Scanner;

class RotateMatrix {
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

      rotate90(matrix, n);
	   
	    System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
		
		
    }
	static void rotate90(int matrix[][], int n){
		 for(int i =0; i< n; i++){
			 for(int j = i; j<n; j++){
				int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
			 }
		 }
		  for(int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
	}
	
}