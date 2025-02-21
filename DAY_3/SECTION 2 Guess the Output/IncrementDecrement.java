public class IncrementDecrement {
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
}



/*


x=5;
y= 6-6+4+4= 8
*/

//output 
8