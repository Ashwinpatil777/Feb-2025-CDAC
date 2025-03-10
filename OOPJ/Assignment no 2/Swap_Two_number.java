import java.util.Scanner;
class Swap_Two_number{
  public static void main(String args[]){
  
  Scanner sc =new Scanner(System.in);
  
 System.out.println("Enter first number (num1)");
   int num1 = sc.nextInt();
   System.out.println("Enter Second number (num1)");
   int num2 = sc.nextInt();
   
  
  System.out.println("\nBefore Swapping: num1 = " + num1 + ", num2 = " + num2);
  
  
   num1 +=num2; //num1 = num1 + num2
   num2 = num1 - num2;//num2 = num1 - num2
   num1 -=num2;  //num1 = num1- num2
   
   System.out.println("\nAfter Swapping: num1 = " + num1 + ", num2 = " + num2);
  
}


}