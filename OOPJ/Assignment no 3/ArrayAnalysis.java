

class ArrayAnalysis{
   public static void main(String args[]){
   

   int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
   
	 System.out.println("Array Element:");
	 
	 for( int num :arr){
		 System.out.print(num + " ");
        }
		
        System.out.println();
		
	  int evenCount = 0;
	  int  oddCount = 0;
	  int multipleOf3Count = 0;
	  int sum =0;
	  int Max = arr[0];
	  int Min = arr[0];
	  
	  for( int num : arr){
	      
		  sum += num;
		  
		  if(num % 2 ==0){
		   evenCount++;
		  }
		  else {
		    oddCount++;
			
		  }
		  if (num % 3 ==0 ){
		   multipleOf3Count++;
		  
		  }
		  if(num > Max) {
			  Max = num;
		  }
		  if( num  < Min)
		  {			 
          	  Min = num;
		  }
	  }
	    System.out.println("Number of Even Numbers: " + evenCount);
        System.out.println("Number of Odd Numbers: " + oddCount);
        System.out.println("Number of Multiples of 3: " + multipleOf3Count);
        System.out.println("Sum of All Numbers: " + sum);
        System.out.println("Maximum Value: " + Max);
        System.out.println("Minimum Value: " + Min);
   
   
   }
}