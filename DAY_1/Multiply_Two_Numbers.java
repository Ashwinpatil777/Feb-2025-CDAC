import java.util.Scanner;

class Multiply_Two_Numbers{
     public static void main( String args[]){


 Scanner scanner = new Scanner(System.in);


System.out.println("Enter the First number:");

int num1 = scanner.nextInt();


  
System.out.println("Enter the Second number:");

int num2 = scanner.nextInt();
   


int mult = num1*num2;
   System.out.println(num1 +  " X " + num2 + " = " + mult);
}
}