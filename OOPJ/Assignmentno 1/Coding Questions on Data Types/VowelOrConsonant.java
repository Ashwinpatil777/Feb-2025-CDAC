import java.util.Scanner;
class VowelOrConsonant{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Character : ");
	char ch = sc.next().charAt(0);
	
	
	
	if( ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'o'){
	System.out.println("The character is a vowel.");
	}
	else
	{
	System.out.println("The character is a consonant.");
	}

	
	
	}
	}