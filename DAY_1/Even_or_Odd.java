import java.util.Scanner;

class Even_or_Odd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even");
        } else {
            System.out.println("The number " + num + " is Odd");
        }

        scanner.close();
    }
}
