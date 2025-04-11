import java.util.Scanner;
class sumOfSeriesFraction{
     static double sum(int n){
	  if(n == 1){
	   return 1.0;
	  }
	  if(n % 2 == 0){
	     return sum(n-1) - 1.0/n;
	  }else{
	   return sum(n-1) + 1.0/n;
	  }
	 }
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   int num = sc.nextInt();
   
  
   System.out.println(sum(num));
   }
}