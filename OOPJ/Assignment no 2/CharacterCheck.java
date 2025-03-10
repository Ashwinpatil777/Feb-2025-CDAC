import java.util.Scanner;

class CharacterCheck{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  
	  char ch = sc.next().charAt(0);
	  
	  
	  String Result = (ch >= 'A' && ch <= 'Z')? "Uppercase Letter" :
	                  (ch >='a' && ch <='z')? "Lowercase Letter" :
					  "Not a Letter";
					  
					  System.out.println(Result);
	 
	 
	
	

     }
}