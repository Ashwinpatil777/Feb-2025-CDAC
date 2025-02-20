   import java.util.Scanner;
   class Discount{
   public static void main(String arg[]){
    Scanner scanner = new Scanner(System.in);
	
	
System.out.println("Enter  the Total purchase Amount :");
  double totalpurchase = scanner.nextDouble();
  
      double discountPercentage=0;
	  
	
  
  if(totalpurchase >= 1000){
       discountPercentage =20;
	     } else if (totalpurchase >= 500) { 
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }
		
	  double discountAmount  = (discountPercentage/100) * totalpurchase;
	  
      double finalAmount = totalpurchase - discountAmount;
	  
		System.out.println("You get a " + discountPercentage + "% discount.");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Final amount after discount: Rs. " + finalAmount);
		
		}
		}