import java.util.Scanner;

 class Power_of_a_Number{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


	System.out.print("Enter the base number: ");
       int base = scanner.nextInt();

	System.out.print("Enter the exponent number: ");
       int exponent = scanner.nextInt();


    double result = Math.pow(base, exponent);
    System.out.println( base + " raise to the power " + exponent + " is " + result);
scanner.close();
}
}