import java.util.Scanner;
class Leap_Year{
   public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the Year");
   
   int year =sc.nextInt();
   
    boolean isleap = (year % 4 == 0  && year % 100 != 0 )|| (year % 400 == 0);
   
   if (isleap){
      System.out.println("Leap Year");
   }else{
   
   System.out.println("Not a Leaf Year");
   }
   
   }

}