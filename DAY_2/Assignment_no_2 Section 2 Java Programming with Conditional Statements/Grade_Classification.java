import java.util.Scanner;
 class Grade_Classification{
  public static void main( String argb[]){
     Scanner scanner =new Scanner(System.in);
	 
	 
	 System.out.println("Enter the mark :");
	 int mark = scanner.nextInt();
	 
	 if(mark >= 90){
		 System.out.println("Grade: A");
	 }
	 else if(mark >80){
		System.out.println("Grade: B"); 
	 }
	 else if(mark >70){
		System.out.println("Grade: C"); 
	 }
	 else if(mark >60){
		System.out.println("Grade: D"); 
	 }
	 else {
		System.out.println("Grade: F"); 
	 }
  }
  
}