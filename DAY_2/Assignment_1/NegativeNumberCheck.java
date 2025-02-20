import java.util.Scanner;

public class NegativeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number " + number + " is Negative.");
        } else  {
            System.out.println("The number " + number + " Not Negative.");
        }

        scanner.close();
    }
}