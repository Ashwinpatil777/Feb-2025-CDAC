class parent{
	  int i = 200;
      void show(){
	    System.out.println("parent");
	  }
}
class child expants parent{
		int num = 100;
		
		int i = 10;
		
		void show(){
		super.show(); //parent class method : call
	    System.out.println("child");
	  }
      
	  void display(){
	     System.out.println(num);
	     System.out.println(i);
	     System.out.println(super.i);

		 
	  }
}
class OverrrideingDemo{
		public static void main(String args[]){
		
		parent p = new parent();
		p.show();
		
		child c = new child();
		c.show1();
		c.display();
		
		
		
		
		}


}