import java.util.Scanner;

class SwitchCalculator{		 
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the First number:");
	  
	  float num1 = sc.nextInt();
	  
	  System.out.println("+, - , * , / , %");
	  
	 char operator = sc.next().charAt(0);
	  
	  System.out.println("Enter the Second number:");
	  
	  float num2 = sc.nextInt();
	  
	  float Result =0;
 	  switch(operator){
		  case '+':
		  Result = num1 + num2;
		  break;
		  
		  case '-':
		  Result = num1 - num2;
		  break;
		  
		  case '*':
		  Result = num1 * num2;
		  break;
		  
		  case '/':
		  Result = num1 / num2;
		  break;
		  
		  case '%':
		  Result = num1 % num2;
		  break;
		  default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
               return;
		  
	  }
	  System.out.println("Result: " + Result);
	  
	
	

     }
}