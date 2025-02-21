public class ConditionalLoopOutput {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
} 


/*

1. Initialization:

  int num = 1;

2.Iteration 1:

 (i<=4)  (1<=4) -true
(i%2)==0  (1 % 2 ==0) false

num +=i --   2+0=2

3.Iteration 3:

 (i<=4)  (3<=4) -true
(i%2)==0  (3 % 2 ==0) false

num -=i --   2-3=-1

4.Iteration 4:

 (i<=4)  (4<=4) -true
(i%2)==0  (4 % 2 ==0) true

num +=i --   -1+4=3

*/


//output
 3