import java.util.Scanner;
class N_Natural_Numbers{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
        int Num = scanner.nextInt();

System.out.println(  Num );
for (int i = 1; i <= Num; i++) {
            System.out.print(i + " ");         }
}
}