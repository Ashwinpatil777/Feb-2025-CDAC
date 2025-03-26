import java.util.Scanner;
class MatrixPrint{
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	   
     System.out.print("Enter number of rows (m)");
       int m = sc.nextInt();
	    System.out.print("Enter number of rows (n)  ");
       int n = sc.nextInt(); 
	   
	   int matrix[][] = new int[m][n];
	    
		System.out.println("Enter the matrix elements:  ");
		for( int i = 0 ; i < m; i++){
		    for (int j =0; j < n; j++){
			 matrix[i][j] = sc.nextInt();
			 
			
			}
		
		}
		System.out.println("\nMatrix elements row-wise:");
		for( int i = 0 ; i < m; i++){
		    for (int j =0; j < n; j++){
			System.out.print(matrix[i][j] + " ");
			 
			
			}
			System.out.println();
		
		}
	   
		
    }
}