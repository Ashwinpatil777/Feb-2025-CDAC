import java.util.Scanner;

class MatrixSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
		
       		int matrix1[][] = new int[m][n];
			int matrix2[][] = new int[m][n];
			int sum[][] = new int[m][n];
			
			System.out.println("Enter elements of first matrix:");
			 for(int i=0; i<m; i++){
			   for(int j=0; j<n; j++){
			        matrix1[i][j]= sc.nextInt(); //take input from each user
					
			   }
		  }
		  System.out.println("Enter elements of Second matrix:");
			 for(int i=0; i<m; i++){
			   for(int j=0; j<n; j++){
			        matrix2[i][j]= sc.nextInt();

			   }
			 }			   
			 for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
		  
		    System.out.println("Sum of the two matrices:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
}
}