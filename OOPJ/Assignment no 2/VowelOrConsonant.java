import java.util.Scanner;
class VowelOrConsonant{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Character");
	char ch = sc.next().toLowerCase().charAt(0);
	
	
	
	String vc = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )? "Vowels" : "Consonant";

	  System.out.println(ch + " is a " + vc);
}
}