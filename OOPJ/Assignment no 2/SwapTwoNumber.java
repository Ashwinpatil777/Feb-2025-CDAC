class SwapTwoNumber{
    public static void main(String args[]){
	
	int num1 = 4;
	int num2 = 5;
	
	System.out.println("Before swapping : num1 : " + num1 + " \n num2 : " + num2);
	
	num1 = num1 ^ num2 ;
	num2 = num2 ^ num1 ;
	num1 = num1 ^ num2 ;
	
	System.out.println("After swapping : num1 : " + num1 + " \n num2 : " + num2);
	
	}

}