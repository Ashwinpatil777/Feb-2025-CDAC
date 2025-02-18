import java.util.Scanner;

class Basic_Arithmetic_operations{
   public static void main(String arg[]){


 Scanner  scanner=new Scanner(System.in);

System.out.println("Enter the First number:");
  int num1=scanner.nextInt();


System.out.println("Enter the Second number:");
  int num2=scanner.nextInt();


int sum=  num1 + num2;
int sub=  num1 - num2;
int mult= num1 * num2;
int div=  num1 / num2;
int mode= num1 % num2;


System.out.println(num1 + " + " +num2 + " = " + sum);
System.out.println(num1 + " - " +num2 + " = " + sub);
System.out.println(num1 + " * " +num2 + " = " + mult);
System.out.println(num1 + " / " +num2 + " = " + div);
System.out.println(num1 + " mod " +num2 + " = " + mode);

  scanner.close();

}
}
