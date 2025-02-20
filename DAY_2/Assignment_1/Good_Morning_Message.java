import java.util.Scanner;

class Good_Morning_Message {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the time : ");
        int time = scanner.nextInt();

        System.out.println("Enter the Time (AM/PM): ");

        String period = scanner.next();

           if(period.equals("AM")&& time >=5 && time <12){
	System.out.println("Good Moring");

}
else{
System.out.println("Not Good Moring");

}



    }
}
