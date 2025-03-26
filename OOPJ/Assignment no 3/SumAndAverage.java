class SumAndAverage{
	public static void main(String args[]){
	
	double arr[] = {1, 2,3,4,5,2.321};
	
	double sum =0;
	
	
	for(double  num : arr){
	  
	   sum +=num;
	}
	 double Average = sum/arr.length;
	System.out.println(sum);
	System.out.println(Average);
	
	
	}
}