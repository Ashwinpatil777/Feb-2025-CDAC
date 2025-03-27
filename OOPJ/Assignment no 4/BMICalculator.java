package Calculation;

import java.util.Scanner;

class BMI{
	private double height;
	private double weight;
	  
	
	BMI(double height,double weight){
		this.height = height;
		this.weight= weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public double calculateBMI() {
		return weight / (height * height);
	}
}
public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter the height in meters:");
		double height = sc.nextDouble();
		
		System.out.print("Enter the weight in kilograms: ");
		double weight = sc.nextDouble();
		
		BMI b1 = new BMI(height ,weight);
		
		double bmi = b1.calculateBMI();
		
		System.out.printf("Your BMI: %.2f\n", bmi);
		
		

	}

}
