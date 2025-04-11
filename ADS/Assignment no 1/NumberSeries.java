class NumberSeries{
   static void printAscending(int n){
    if(n > 0){
	 printAscending(n-1);
	 System.out.print(n + " ");
   }
  }
  static void printDecending(int n){
	  if(n > 0){
		  System.out.print(n + " ");
	     printDecending(n-1);
  }
  }
  public static void main(String args[]){
  int n=10;
  System.out.println("Ascending order:");
  printAscending(n);
  System.out.println("\nDescending order:");
   printDecending(n);
   
  }
}