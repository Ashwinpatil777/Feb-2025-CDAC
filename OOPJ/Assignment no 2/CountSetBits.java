import java.util.Scanner;

class CountSetBits{
	      
		 static int countOnes(int n){
			  int count = 0;
			  while (n > 0){
				  
				  n= n & (n-1);
				  count++;
			  
		  }
		  return count;
	
		 }
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int num = sc.nextInt();
	  
	  String binary = Integer.toBinaryString(num);
	  
	  int Result = countOnes(num);
	  System.out.println("Binary representation: " + binary);
	 System.out.println("Number of the binary representation: " + Result);
	  
	  
	
	

     }
}