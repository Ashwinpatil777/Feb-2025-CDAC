import java.util.Scanner;

class Prime_number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean prime = num > 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
if(prime){
        System.out.println("The Number " + num + " is a prime number.");
}
else{

System.out.println("The Number " + num + " is a not a prime number.");
}
    }
}
