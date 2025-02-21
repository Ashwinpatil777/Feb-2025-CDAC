public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i <= 0; i++) {
 System.out.println(i);
 }
 }
}


//infinity


public class WrongInitializationForLoop {
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
}

//output

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac WrongInitializationForLoop.java

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java WrongInitializationForLoop
10
9
8
7
6
5
4
3
2
1
0