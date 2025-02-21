/*
 Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1 
*/
class pattern8 {
    public static void main(String args[]) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= num - i + 1; j--) {
                System.out.print(j);
                if (j > num - i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
