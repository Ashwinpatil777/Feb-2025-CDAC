import java.util.Scanner;

class IncrementWithoutPlus{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  
	  int num = sc.nextInt();
	  
 	  int Increment = - ~num; 
	  /*-(-(num+1))  num=5;  -(-(5+1)); -(-6);
                = 6	*/
  System.out.println("Absolute Value: " + Increment);
	  
	
	

     }
}