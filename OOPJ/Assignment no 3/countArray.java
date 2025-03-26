class countArray{
	public static void main(String args[]){
	 
	 int arr[] = {1,2,4,3,5,6,7,8};
	 
	 int evenCount = 0;
	 int OddCount = 0;
	 
	 for( int num : arr){
	    if ( num % 2 == 0){
		     evenCount++;
		}else 
		{
		OddCount++;
		}
	 
	 }
	 System.out.println("Even number count " + evenCount);
	 System.out.println("Odd number Count " + OddCount);
	
	}

}