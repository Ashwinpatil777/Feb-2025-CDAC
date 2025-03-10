import java.util.Scanner;

class EvenOddBitwise{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the First number:");
	  
	  int num = sc.nextInt();
	  
	  String result = (( num & 1) == 0)? " Even" : "Odd";
	
	System.out.println(result);
     }
}