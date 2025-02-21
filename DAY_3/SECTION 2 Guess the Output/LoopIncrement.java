public class LoopIncrement {
 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 }
}


/*


1. Initialization:

  int count = 0;

2.Iteration 1:

(i < 4)  (2<4) true
 count += i++ - ++i = 2 -4 = -2
 count +=-2 = -2-2 =-4

*/

//output
-4
