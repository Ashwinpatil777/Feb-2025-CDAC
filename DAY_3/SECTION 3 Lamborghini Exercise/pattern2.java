/*
14. Write a program to print the following pattern:
 *
 **
 ***
 *****
 *******
 ********* 
1
12
123
1234
12345
123456


*/

class pattern2{
public static void main(String arg[]){

for(int i=0; i<7; i++){
for(int j=0; j<=i; j++){

 System.out.print("*");

}
System.out.println();
}

}

}