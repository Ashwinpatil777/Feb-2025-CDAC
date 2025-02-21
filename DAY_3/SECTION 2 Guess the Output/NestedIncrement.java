public class NestedIncrement {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
} 

/*

a=10   // 11,10
b=5    //4,5

result = 11*5-10+4= 55-10+4=45+4=49

*/


//output



49