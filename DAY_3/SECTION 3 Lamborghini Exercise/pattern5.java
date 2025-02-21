/*

Write a program to print the following pattern:
*****
 ****
 ***
 **
 * 

*/


class pattern5{

public static void main(String arg[]){

int num =5;
for( int i=num; i>=1; i--){
  for( int j=1; j<=num-i; j++){
 System.out.print(" ");

 }
            
            for (int k = 1; k <= (1 * i); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}