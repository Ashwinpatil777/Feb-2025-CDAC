class LargestDigit{
public static void main(String arg[]){
int number= 4825;
int largerNumber =0;
 while (number > 0){
int  digit = number % 10;
if (digit >largerNumber){
 largerNumber =digit;
}
number /= 10;
}
System.out.println("The largest digit is: " + largerNumber);
}
}