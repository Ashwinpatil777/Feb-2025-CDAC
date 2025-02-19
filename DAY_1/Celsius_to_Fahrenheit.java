import java.util.Scanner;
class  Celsius_to_Fahrenheit{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
	 System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

       double Fahrenheit =(celsius * 9/5) + 32;

	System.out.print(celsius + "°C is equal to " + Fahrenheit + "°F");
  }
}
