import java.util.Scanner;

public class RecursiveOperations {

    // 1. Check if number is prime using recursion
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    // 2. Check if string is palindrome using recursion
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    // 3. Find sum of digits using recursion
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    // 4. nth Fibonacci number using recursion
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Power function using recursion
    static int power(int a, int b) {
        if (b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prime check
        System.out.print("Enter a number to check if it's prime: ");
        int primeNum = sc.nextInt();
        System.out.println(primeNum + " is prime? " + isPrime(primeNum, 2));

        // Palindrome check
        System.out.print("Enter a string to check palindrome: ");
        sc.nextLine(); // consume leftover newline
        String str = sc.nextLine();
        System.out.println("'" + str + "' is palindrome? " + isPalindrome(str, 0, str.length() - 1));

        // Sum of digits
        System.out.print("Enter a number to find sum of digits: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));

        // Fibonacci
        System.out.print("Enter n to get nth Fibonacci number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));

        // Power calculation
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}
