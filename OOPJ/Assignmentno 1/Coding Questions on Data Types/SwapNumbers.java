
import java.util.Scanner;
class SwapNumbers{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the First number");
	int num1 = sc.nextInt();
	
	System.out.println("Enter the Second number");
	int num2 = sc.nextInt();
	
	System.out.println("//Before swapping:");
	System.out.println("First number: " + num1);
	System.out.println("Second number: " + num2);

	int temp =num1;
	num1 = num2 ;
	num2 =temp;
	System.out.println("//After Swapping ");
	System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
		
		num1 =num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
	System.out.println("//After Swapping back");
	System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
	}
	
	
	}