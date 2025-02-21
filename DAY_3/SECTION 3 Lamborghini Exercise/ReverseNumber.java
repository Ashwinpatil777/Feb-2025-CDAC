//Write a program to reverse the digits of the number 1234. The output should be 4321.




class ReverseNumber{

public static void main(String[] args) {

int num =1234;
int reversed=0;

while(num > 0){
int digit = num % 10;
reversed =reversed * 10 + digit;
num/=10;
  }

        System.out.println("Reversed number: " + reversed);
    }
}


/*
Step-by-Step Execution
Iteration num	digit = num % 10 reversed = reversed * 10 + digit  num /= 10
1st	1234	4	0 * 10 + 4 = 4	                                123
2nd	123	3	4 * 10 + 3 = 43                          	12
3rd	12	2	43 * 10 + 2 = 432	                        1
4th	1	1	432 * 10 + 1 = 4321	                        0 (stop)

*/