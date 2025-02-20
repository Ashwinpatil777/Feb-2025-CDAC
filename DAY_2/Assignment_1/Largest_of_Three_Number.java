import java.util.Scanner;


class Largest_of_Three_Number{
public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

 System.out.println("Enter First  number:");
        int num1 = scanner.nextInt();
System.out.println("Enter Second  number:");
        int num2 = scanner.nextInt();
System.out.println("Enter Third  number:");
        int num3 = scanner.nextInt();

int Largest = num1;

if(num2 > Largest){
   Largest =num2;
}

if(num3 > Largest){
Largest=num3;
}
System.out.println("The largest number is: " + Largest);
scanner.close();
}

}