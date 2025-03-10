import java.util.Scanner;
class Even_Odd{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Number ");
	int num = sc.nextInt();
	
	
	
	if ((num & 1) == 0){
	     System.out.println("Even");
	}
	else{
	     System.out.println("Odd");
		 }
		 
	   
	
	  }
	
}