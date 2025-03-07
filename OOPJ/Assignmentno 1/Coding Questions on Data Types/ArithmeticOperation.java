import java.util.Scanner;
class ArithmeticOperation {
   public static void main(String args[]){
    
	Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Your First Number");
	  int num1=sc.nextInt();
	  
	  System.out.println("Enter Your Second Number");
	  int num2=sc.nextInt();
	  
	  int sum = num1 + num2 ;
	  int sub = num1 - num2 ;
	  int mult = num1 * num2;
	  int div  = num1 / num2;
	  int mod = num1 % num2 ;
	  
	  
	   System.out.println("Addition of Two number (" + num1 + " + " + num2 + ") is :" + sum );
	   System.out.println("Substration of Two number (" + num1 + " - " + num2 + ") is :" + sub );
	   System.out.println("Multiplication of Two number (" + num1 + " * " + num2 + ") is :" + mult );
	   System.out.println("Division of Two number (" + num1 + " / " + num2 + ") is :" + div );
	   System.out.println("Modules of Two number (" + num1 + " % " + num2 + ") is :" + mod );
   }
}