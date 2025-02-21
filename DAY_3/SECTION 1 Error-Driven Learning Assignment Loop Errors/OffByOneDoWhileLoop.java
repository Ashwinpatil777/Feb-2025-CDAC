public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num;
 } while (num > 5);
 }
}

//
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>javac OffByOneDoWhileLoop.java

E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java OffByOneDoWhileLoop
1

public class OffByOneDoWhileLoop {
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num++;
 } while (num <= 5);
 }
}

//output
E:\CDAC JAVA CODE  ASSIGNMENT\Assignment 3>java OffByOneDoWhileLoop
1
2
3
4