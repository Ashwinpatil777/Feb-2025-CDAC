class RemoveDuplicates{

       static int removeDuplicates(int arr[]){
	      int i = 0;
		  for ( int j=0; j< arr.length; j++){
		   if( arr[j] != arr[i]){
		    arr[++i] = arr[j];
		   }
		  }
		  return i + 1;
	   }
	public static void main(String args[]){
	
	    int[] arr = {1, 1, 2, 2, 3, 4, 4, 5}; 
        int newLength = removeDuplicates(arr);
		
		for( int i =0; i < newLength; i++){
			 System.out.print(arr[i] + " ");
	}
	}
}