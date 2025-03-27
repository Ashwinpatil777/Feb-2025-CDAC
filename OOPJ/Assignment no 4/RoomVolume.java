package Calculation;
class Room{
	private double height;
	private double width;
	private double breath;
	   
	Room(double height, double width, double breath){
		this.height =height;
		this.width = width;
		this.breath = breath;
		
	}
	public double volume() {
		return height * width * breath;
	}
}

public class RoomVolume {

	public static void main(String[] args) {
		
		
		Room r1 = new Room(10.2,20.2,30.2);
		r1.volume();
		System.out.println("Volume "+r1.volume());

	}

}
