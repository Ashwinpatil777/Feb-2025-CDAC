import java.util.Scanner;

class Average{
public static void main(String args[]) {

Scanner scanner =new Scanner(System.in);


System.out.println("Enter First  number:");
        double num1 = scanner.nextInt();
System.out.println("Enter Second  number:");
        double num2 = scanner.nextInt();
System.out.println("Enter Third  number:");
        double num3 = scanner.nextInt();


double Average=(num1+num2+num3)/3;
System.out.println("The average of the three number is "+ Average);

scanner.close();
}
}
