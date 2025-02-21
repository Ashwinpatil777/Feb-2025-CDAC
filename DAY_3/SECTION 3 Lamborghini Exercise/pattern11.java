/*
Write a program to print the following pattern:
11111
22222
33333
44444
55555 


*/

class pattern11 {
    public static void main(String args[]) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
