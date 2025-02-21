public class LoopVariableScope {
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}

//Error

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac LoopVariableScope.java
LoopVariableScope.java:6: error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopVariableScope
1 error

//correct
public class LoopVariableScope {
 public static void main(String[] args) {
int x = 0;
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x);  }
}

//output
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac LoopVariableScope.java
 8