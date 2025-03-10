import java.util.Scanner;

class AbsoluteValueBitwise{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int num = sc.nextInt();
	  
	  
	int mask = num >> 31;
	  
	 int abs = ( num + mask) ^ mask;
	  
	  System.out.println("Absolute value: " + abs);
	
	/*
	mask = -15 >> 31 = -1
	abs = (-15 + (-1)) ^ (-1) = (-16) ^ (-1) = 15
	*/
	}

}