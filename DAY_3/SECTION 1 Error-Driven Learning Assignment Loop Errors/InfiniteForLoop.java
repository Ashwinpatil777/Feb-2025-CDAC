public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
} 


//
 The loop runs infinitely because the loop condition i < 10 is always true.

//Correct

public class InfiniteForLoop {
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.print(i+ " ");
 }
 }
} 

//output

0 1 2 3 4 5 6 7 8 9