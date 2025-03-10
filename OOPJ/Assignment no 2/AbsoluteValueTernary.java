import java.util.Scanner;

class AbsoluteValueTernary{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  
	  int num = sc.nextInt();
	  
	  int result = (num < 0)?  -num : num ;
	  
	  System.out.println("Absolute Value: "+result);
	  
	
	

     }
}