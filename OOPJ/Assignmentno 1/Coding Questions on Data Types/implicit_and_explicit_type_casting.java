class implicit_and_explicit_type_casting{
   public static void main(String args[]){
   
   
   byte a = 10;
   float f = a;
   
   System.out.println(f); //Implicite 
   
   
    
   double d = 10.0868657887889;
   float f1 = (float) d;
   
   System.out.println(f1); //Explicit
   
   } 


}