import java.util.Scanner;

 class Count_the_Number{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


	System.out.print("Enter the number: ");
 int number = scanner.nextInt();

      int count = 0;
        int temp = Math.abs(number); 
        if (temp == 0) {
            count = 1; // Special case for 0
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
} 