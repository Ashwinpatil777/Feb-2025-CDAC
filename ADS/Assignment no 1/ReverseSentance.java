import java.util.Scanner;
class ReverseSentance{
   static String reverse(String str){
      if(str.length() <= 1){
	  return str;
	  }
	  return reverse(str.substring(1)) + str.charAt(0);
   
   }
   public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Sentance");
	 String st1 = sc.nextLine();
	 
	 System.out.println("Reverse Sentance :" + reverse(st1));
   }


}