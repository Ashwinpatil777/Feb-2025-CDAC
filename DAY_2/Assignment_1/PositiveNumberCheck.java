import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else  {
            System.out.println("The number " + number + "  not positive ");
        } 

       }
}