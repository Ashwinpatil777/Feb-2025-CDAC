public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
}


//

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac IncorrectWhileLoopControl.java
IncorrectWhileLoopControl.java:4: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
1 error


//correct

public class IncorrectWhileLoopControl {
 public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
 System.out.println(num);
 num--;
 }
 }
}

//output

10