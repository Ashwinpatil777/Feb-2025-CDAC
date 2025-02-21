public class WhileLoopBreak {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }
} 

/*


Iteration 1:

(0 < 5)

count++ = 1
(1==3) false


Iteration 2:

(1 < 5)

count++ = 2
(2==3) false


Iteration 3:

(3 < 5)

count++ = 3
(3==3) True

*/

//output

0 1 2 3
