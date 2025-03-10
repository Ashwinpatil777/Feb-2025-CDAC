import java.util.Scanner;

class Pass_fail{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  
	  int num = sc.nextInt();
	 
	  String Result = (num <= 40) ? " Pass " : "Fail";
	  
	  System.out.println(Result);
	
	

     }
}