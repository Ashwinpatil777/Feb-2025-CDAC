package Calculation;

class Student{
	 private String name;
	 private int marks1;
	 private int marks2;
	 private int marks3;
	 
	public void SetValue(String name , int marks1, int marks2, int marks3){
		 this.name= name;
		 this.marks1=marks1;
		 this.marks2=marks2;
		 this.marks3=marks3;
	 }
	public int getTotalMarks() {
		return marks1 + marks2 + marks3;
	}
	
	public double getAverageMarks() {
		return getTotalMarks()/ 3.0;
	}
	
	public void display() {
		System.out.println("Name of the Student " +name);
		System.out.println("Total marks " + getTotalMarks());
		System.out.println("Average marks " + getAverageMarks());
	}
	 
}
public class StudentMark {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.SetValue("Ashwin" , 90, 80, 70);
	     s1.display();

	}

}
