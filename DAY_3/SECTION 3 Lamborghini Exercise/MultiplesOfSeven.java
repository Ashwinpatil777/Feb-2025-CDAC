//Write a program to print all multiples of 7 between 1 and 100. 	


class MultiplesOfSeven{

public static void main(String args[]){

 System.out.println("Multiples of 7 between 1 and 100: ");

for(int i=7; i<=100; i++){

  if(i % 7 == 0){
   System.out.println(i + " ");

}
}
}
}