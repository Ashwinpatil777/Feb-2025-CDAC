//import java.util.Scanner;
class multiplication{
   static void multi(int number ,int i){
  if(i > 10){
  return ;
  } 
  System.out.println(number + " X " + i +" = " + (number * i));
    multi(number, i + 1);
  }

  public static void main(String args[]){
  // Scanner sc = new Scanner(System.in);
   
  // System.out.println("Enter the number ");
 //  int n = sc.nextInt();
   int number = 5;
   multi(number,1);
  
  
  }
}