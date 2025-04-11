class palindromeIterative{
   static boolean palindrome1(String str){
	   int left =0;
	   int right =str.length() - 1;
	   
	   while(left < right){
		   if(str.charAt(left) != str.charAt(right)){
			   return false;
		   }
		   left++;
		   right--;
	   }
	   return true;
	   
   }
  
  public static void main(String args[]){
   String str = "madam";
   if(palindrome1(str)){
	   System.out.println(str + " is palindrom ");
   }
  else{
	  System.out.println(str + " is Not palindrom ");
  }
  
  }

}