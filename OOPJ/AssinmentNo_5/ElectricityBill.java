package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill1{
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public ElectricityBill1(String customerName,double unitsConsumed ) {
		this.customerName = customerName;
		this.unitsConsumed= unitsConsumed;
		this.billAmount=0;
		
		if(unitsConsumed < 0) {
		throw new IllegalArgumentException("UnitConsumed is Negative number  please Enter valied number ");
		
		}
	}
		public void  calculateBillAmount()
		{
			if(unitsConsumed <= 100) {
				billAmount = unitsConsumed * 5;
			}else if(unitsConsumed <= 300) {
				billAmount = (100 * 5) + ((unitsConsumed -100) * 7);
			}
			else {
				billAmount = (100 *5) + (200 *7) + ((unitsConsumed -300) * 10 );
			}
		}
		public void display() {
			System.out.println("customerName :"+customerName);
			System.out.println("unitsConsumed :"+unitsConsumed);
			System.out.println("billAmount :"+billAmount);
			
		}
	}
	


public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the Customer name : ");
			String st = sc.nextLine();
			
			System.out.println("Enter the units consumed : ");
			double d1 = sc.nextDouble();
			
			ElectricityBill1 bill = new ElectricityBill1(st , d1);
			bill.calculateBillAmount();
			bill.display();
			
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid input! Please enter a numeric value for units consumed.");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
