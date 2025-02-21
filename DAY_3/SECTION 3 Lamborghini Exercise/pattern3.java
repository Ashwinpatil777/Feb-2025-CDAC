/*

 Write a program to print the following pattern:
 *
 **
 ***
 ****
 *****

*/

class pattern3{
public static void main(String args[]){
int num = 5;

     for(int i = 1; i <= num; i++){
        for(int k = 1; k <= num - i; k++){
             System.out.print(" ");
}
     for(int j = 1; j <= i; j++){

         System.out.print("* ");

}
         System.out.println();
}
}
}
