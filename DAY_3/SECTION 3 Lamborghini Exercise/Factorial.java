//Write a program to compute the factorial of the number 10


class Factorial{
public static void main(String args[]){

//int num=10;

long Factorial = 1;

for(int i =1; i <=10; i++){
 Factorial=Factorial*i;
}
System.out.println("The Factorial of 10 is " + Factorial);
}
}