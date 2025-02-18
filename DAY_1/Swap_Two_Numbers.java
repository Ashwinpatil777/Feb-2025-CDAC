import java.util.Scanner;

class Swap_Two_Numbers{

 public static void main(String args[]){

Scanner scanner =new Scanner(System.in);


System.out.println("Enter the first number: ");
 int num1 =scanner.nextInt();



System.out.println("Enter the Second number: ");
 int num2 =scanner.nextInt();



System.out.println("Before swapping: ");
System.out.println("First Number:" +num1 );
System.out.println("Second Number :"+num2 );



int temp =num1;
num1=num2;
num2=num1;

System.out.println("After swapping: ");
System.out.println("First Number:" +num1 );
System.out.println("Second Number :"+num2 );
 scanner.close();
}
}

