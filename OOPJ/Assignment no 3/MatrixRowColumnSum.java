import java.util.Scanner;

class MatrixRowColumnSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
		
       		int matrix[][] = new int[m][n];
			
			
			
			
			  System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
			
			System.out.println("\n sum of each row");
			for(int i = 0; i < m; i++){
				int rowSum =0;
			    for (int j =0; j< n; j++){
				rowSum += matrix[i][j];
				}
				System.out.println("Row " + (i + 1) + ": " + rowSum);
		   }
		   
		    System.out.println("\n sum of each Column");
			for(int i = 0; i < n; i++){
				int colSum=0;
			    for (int j =0; j< m; j++){
				colSum += matrix[i][j];
				}
				System.out.println("Row " + (i + 1) + ": " + colSum);
		   }

        }
}