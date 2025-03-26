import java.util.Scanner;

class StudentMarksAnalysis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int studentNumber = 2;
        int physics[] = new int[studentNumber];
        int chemistry[] = new int[studentNumber];
        int maths[] = new int[studentNumber];

        int countAbove75 = 0;
        int countBelow40 = 0;

        // Taking input for students
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
        }

        // Processing marks
        for (int i = 0; i < studentNumber; i++) {
            double aggregate = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (aggregate >= 75.0) {
                countAbove75++;
            } else if (aggregate <= 40.0) {
                countBelow40++;
            }
        }

        // Displaying results
        System.out.println("\nNumber of students securing 75% and above: " + countAbove75);
        System.out.println("Number of students securing 40% and below: " + countBelow40);

        // Closing scanner
        sc.close();
    }
}
