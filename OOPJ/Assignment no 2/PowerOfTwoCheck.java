import java.util.Scanner;

class PowerOfTwoCheck {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		
		boolean result  = (num > 0 ) && ((num & (num - 1)) == 0);
		String result1 = (result)? "a power of 2" : "not a power of 2";
		System.out.print(result1);
		
		
		/*   num = 8
		     num = num -1
			 num = 7
			 
			 8 & 7 
			 1000   &
			 0111
			--------
	         0000       value is 0000 then power is 2
			            value is 0001 the power is not 2 
			 */
		 
	}
}