 
 
 class SwapOddEvenBits {
	 
	 
	 static int swapBit(int x){
			int evenBits = (x & 0xAAAAAAAA) >> 1;
			int oddBits = (x & 0x55555555) << 1;
			return (evenBits | oddBits);
			
		}
		 
	 public static void main(String args[]){
	    int num =23;
		int swapped = swapBit(num);
		
		 System.out.println("Original number: " + num);
		  System.out.println("Swapped number: " + swapped);
    
	
    }
}
