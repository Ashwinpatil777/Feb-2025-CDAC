import java.util.Scanner;

class MatrixMaxElement {
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
     	
		int maxElement = matrix[0][0];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
			   if(matrix[i][j] > maxElement){
                 maxElement = matrix[i][j];
			   }				   
		      		
			}
		}
		System.out.println("The maximum element in the matrix is: " + maxElement);

		
    }
}