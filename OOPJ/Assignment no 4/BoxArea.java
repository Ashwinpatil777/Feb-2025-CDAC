package Calculation;
class Box{
	private double height;
	private double width;
	private double breadth;
	
	Box(double height , double width, double breadth){
		this.height= height;
		this.width =width;
		this.breadth=breadth;
		
	}
	public double getVolume() {
		return height * width * breadth;
	}
public double getArea() {
		return 2 * (height * width +  width * breadth + height *  breadth);
	}
public void display() {
   
	System.out.println("Box Dimensions: Height = " + height + ", Width = " + width + ", Breadth = " + breadth);
	System.out.println(" Volume : " + getVolume());
	System.out.println(" Volume : " + getArea());
	
}
}
public class BoxArea {

	public static void main(String[] args) {
		
		Box b1 = new Box(12,2,4);
		b1.display();
	}
	

}
