class MissingNumber{
	 static int missingNumber(int[] num){
	     int n = num.length + 1;
		 int sum = (n * ( n + 1))/2;
		 
		 int arrSum =0;
		 for (int nums : num){
		     arrSum += nums;
			 
		 }
		 
		 return sum - arrSum;
	 }
	public static void main(String args[]){
	    int arr[] = {1,2,3,4,5,6,8};
		for ( int num1 : arr){
			System.out.print(" " +num1);
			
			
		} 
		 System.out.println();

		
			
		System.out.println("Missing Number: " + missingNumber(arr));
	}

}