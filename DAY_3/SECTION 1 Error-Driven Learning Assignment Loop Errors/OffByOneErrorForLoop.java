public class OffByOneErrorForLoop {
 public static void main(String[] args) {
 for (int i = 1; i < 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}


E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac OffByOneErrorForLoop.java

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java OffByOneErrorForLoop
1
2
3
4
5
6
7
8
9
10

// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
   we remove only = in i