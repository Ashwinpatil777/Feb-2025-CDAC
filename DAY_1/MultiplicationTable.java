import java.util.Scanner;

class MultiplicationTable{

public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);

System.out.print("Input a number: ");
        int num = scanner.nextInt();

   for( int i=1; i <=10; i++){
      
     int table = num * i;
  System.out.println(num + " * " + i + " = " + table);

}
scanner.close();
}


}