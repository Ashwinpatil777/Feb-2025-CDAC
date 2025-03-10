import java.util.Scanner;
class  AtLeastTwoTrue{

   public static void main(String  args[]){
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter First Boolean (true/False)");
	 boolean x = sc.nextBoolean();
	 
	 System.out.println("Enter Second Boolean (true/False)");
	 boolean y = sc.nextBoolean();
	 
	 System.out.println("Enter Third Boolean (true/False)");
	 boolean z = sc.nextBoolean();
	 
	 
	 boolean result = (x && y ) || (y && z) || (x && z);
	 
	 
   System.out.println("At least two values are true:" + result);
   }
   
   }