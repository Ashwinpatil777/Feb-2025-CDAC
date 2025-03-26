import java.util.Scanner;

class MatrixTranspose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
		
		int matrix[][] = new int[m][n];
		int transpose[][] = new int[n][m];
		
		
		 System.out.println("Enter the matrix elements:");
		 for( int i =0; i< m; i++){
		    for( int j = 0; j<n; j++){
			  matrix[i][j] = sc.nextInt();
			}
		 }
		
		 for( int i =0; i< m; i++){
		    for( int j = 0; j<n; j++){
			  transpose[j][i] = matrix[i][j];
			  
			}
		 }
		System.out.println("Transpose of the matrix:");
		for( int i =0; i < m; i++){
			for(int j =0; j<n; j++){
				 System.out.print(transpose[i][j] + " ");
			}
	            System.out.println();

		}
		
         
		 
		 
	}
}