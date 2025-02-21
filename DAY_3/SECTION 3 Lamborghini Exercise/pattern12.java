/*
Write a program to print the following pattern:
1
22
333
4444
55555 
*/


class pattern12 {
    public static void main(String args[]) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
