/*
Write a program to print the following pattern:
1
12
123
1234
12345 
*/

class pattern13 {
    public static void main(String args[]) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
