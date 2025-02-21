/*
Write a program to print the following pattern:
*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
*********
*/

class pattern10 {
    public static void main(String args[]) {
        int num = 5;
               for (int i = num; i >= 1; i--) {
            for (int k = 0; k < num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

                for (int i = 2; i <= num; i++) {
            for (int k = 0; k < num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
