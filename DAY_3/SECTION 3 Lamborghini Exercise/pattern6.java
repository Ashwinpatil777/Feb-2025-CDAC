/*
Write a program to print the following pattern:
    *
   ***
  *****
 *******
  *****
   ***
    * 
*/

class pattern6 {
    public static void main(String args[]) {
        int num = 4; // Number of rows in the upper half

        
        for (int i = 1; i <= num; i++) {
                       for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

               for (int i = num - 1; i >= 1; i--) {
                       for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
                       for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

