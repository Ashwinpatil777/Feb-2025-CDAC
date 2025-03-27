package Calculation;

import java.util.Scanner;

class ElectricityBill1{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	  
	public ElectricityBill1(String customerName, double unitsConsumed ) {
		this.customerName = customerName;
		this.unitsConsumed=unitsConsumed;
	}
	
	public void calculateBillAmount() {
		if(unitsConsumed <= 100) {
			billAmount =unitsConsumed * 5;
		}
		else if(unitsConsumed <= 200) {
			billAmount =(100 * 5)*((unitsConsumed-100) * 7);
		}
		else {
			billAmount = (100 * 5) * (200 * 7) * ((unitsConsumed -300) * 10);
		}
	}
	public void display() {
		System.out.println("Customer name  : " + customerName );
		System.out.println("unit consumed  : " + unitsConsumed );
		System.out.printf("Total bill Amount Rs.  :  %.2f" , billAmount );
		
	}
} 
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();
        
		ElectricityBill1 E1 = new ElectricityBill1(name , units);
		
		E1.calculateBillAmount();
		E1.display();
		
		
		
	}

}
