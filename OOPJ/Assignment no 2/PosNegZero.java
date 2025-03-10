import java.util.Scanner;

class PosNegZero{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  
	  int num = sc.nextInt();
	 
	  
	String Result = (num > 0)?  "postive" : (num < 0)? "Negative" : "zero"; 
	System.out.println(Result);
	
	

     }
}