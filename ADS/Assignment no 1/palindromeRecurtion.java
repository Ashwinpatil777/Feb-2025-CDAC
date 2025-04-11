class palindromeRecurtion{
   static boolean palindrome1(String str, int left , int right){
	   if(left >= right){
		   return true;
	   }
	   if(str.charAt(left) != str.charAt(right)){
		   return false;
		   
	   }
	   return palindrome1(str , left + 1, right -1);
	   
	   
   }
  
  public static void main(String args[]){
   String str = "madam";
    boolean result = palindrome1(str, 0, str.length() - 1);
   if(result){
	   System.out.println(str + " is palindrom ");
   }
  else{
	  System.out.println(str + " is Not palindrom ");
  }
  
  }

}