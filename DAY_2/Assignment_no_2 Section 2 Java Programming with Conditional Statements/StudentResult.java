import java.util.Scanner;
class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter marks for Subject 1:");
        int subject1 = scanner.nextInt();

        System.out.println("Enter marks for Subject 2:");
        int subject2 = scanner.nextInt();

        System.out.println("Enter marks for Subject 3:");
        int subject3 = scanner.nextInt();
		
		
		
	int count=0;
		 
		 
		 if(subject1 <40){
		 count++;
		 }
		 if(subject2 < 40){
		 count++;
		 }
		 if(subject3 < 40){
		 count++;
		 }
		 if(count == 0){
		        System.out.println("Student Passed in all Subjects. ");
				}
				else{
				System.out.println("Student Failed in " + count + " subject");
		   }
		   }
		   }