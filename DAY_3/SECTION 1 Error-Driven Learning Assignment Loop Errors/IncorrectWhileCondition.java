public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
} 

//Error
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac IncorrectWhileCondition.java
IncorrectWhileCondition.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
1 error

//correct

public class IncorrectWhileCondition {
 public static void main(String[] args) {
 int count = 5;
 while (count > 0) {
 System.out.println(count);
 count--;
 }
 }
} 
//output
5
4
3 
2 
1