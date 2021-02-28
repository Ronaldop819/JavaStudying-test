package Inheritance.teste;

public class MountainBike extends Bicycle {

	//	the MountainBike subclass adds one more field
	public int seatHeight; 
	
public MountainBike(int gear, int speed, int startHeight) {
	
//	invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
		
	}

//	the MountainBike subclass add one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
		
	}

//	overriding toString() method
//	of Bicycle to print more info
	
	@Override
	public String toString() {
		return (super.toString() + "\nSeat height is " + seatHeight);
		
	}
	

}
