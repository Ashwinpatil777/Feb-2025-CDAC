public class DecrementingLoop {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
}

/* 
Explain
iteration 1:
i>0  (5>0)  true

total +=i -- 0+5=5
(i==3) ---(5==3) false
total -=1 -- (5-1)=4

iteration 2:
i>0  (4>0)  true

total +=i -- 4+4=8
(i==3) ---(4==3) false
total -=1 -- (8-1)=7

iteration 3:
i>0  (3>0)  true

total +=i -- 7+3=10
(i==3) ---(3==3) true


iteration 4:
i>0  (2>0)  true

total +=i -- 10+2=12
(i==3) ---(2==3) false
total -=1 -- (12-1)=11

iteration 5:
i>0  (1>0)  true

total +=i -- 11+1=12
(i==3) ---(1==3) false
total -=1 -- (12-1)=11

//output

11