import java.util.Scanner;
class RangeCheck{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	
	boolean result = (num >=20 && num =< 50);
	System.out.println("Is the number within the range 20 to 50" +result);

}
}