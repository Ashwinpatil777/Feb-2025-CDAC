import java.util.Scanner;

class DayofWeek {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter the number (1-7): ");
        int week = scanner.nextInt();
  
        String day;
        String weekdays;
  
        switch (week) {
            case 1:
                day = "Monday";
                weekdays = "Weekday";
                break;
            case 2:
                day = "Tuesday";
                weekdays = "Weekday";
                break;
            case 3:
                day = "Wednesday";
                weekdays = "Weekday";
                break;
            case 4:
                day = "Thursday";
                weekdays = "Weekday";
                break;
            case 5:
                day = "Friday";
                weekdays = "Weekday";
                break;
            case 6:
                day = "Saturday";
                weekdays = "Weekend";
                break;
            case 7:
                day = "Sunday";
                weekdays = "Weekend";
                break;
            default:
                day = "Invalid";
                weekdays = "";
                break;
        }
  
        System.out.println(day + " - " + weekdays);
    }
}
