package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class student{
	private String name;
	private int rollNo;
	private double marks[];
	private double average;
	private char grade;
	
	public student(String name,	int rollNo ,double marks[]){
		this.name=name;
		this.rollNo=rollNo;
		this.marks= new double[5];
		for(int i =0; i<5; i++) {
		if(marks[i] < 0 || marks[i] > 100) {
			throw new  IllegalArgumentException("Marks must be between 0 and 100.");
		}
		this.marks[i] = marks[i];
		}
		 
	}
	public void calculateAverage() {
		double sum = 0;
		for(double mark : marks){
			sum += mark;
		}
		this.average = sum/5;
	}
	void calculateGrade() {
		if (average >= 90) {
			grade = 'A';
			
		}else if(average >= 80) {
			grade = 'B';
		} else if(average >= 70) {
			grade = 'C';
		}else if(average >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
	}
	void displayStudentInfo() {
		 System.out.println("Student Name: " + name);
	     System.out.println("Roll Number: " + rollNo);
	     System.out.print("Marks: ");
	     for(double mark : marks) {
	    	 System.out.print(mark + " ");
	     }
	     System.out.println();
	     System.out.println("Average Marks: " + average);
	     System.out.println("Grade: " + grade);
	}
}
public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			 System.out.print("Enter Student Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Roll Number: ");
	            if(!sc.hasNextInt()) {
	            	 throw new InputMismatchException("Invalid input! Please enter an integer value for roll number.");
	            }
	            int rollNo = sc.nextInt();
	            double[] marks = new double[5];
	            System.out.println("Enter marks for 5 subjects");
	            for(int i =0; i<5; i++) {
	            	if(!sc.hasNextDouble()) {
	            		throw new InputMismatchException("Invalid input! Please enter numeric values for marks.");
	            	}
	            	 marks[i] = sc.nextDouble();
	            }
	            student student = new student(name, rollNo, marks);
	           
	            student.calculateAverage();
	            student.calculateGrade();
	            student.displayStudentInfo();
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input! Please enter valid numeric values.");
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
