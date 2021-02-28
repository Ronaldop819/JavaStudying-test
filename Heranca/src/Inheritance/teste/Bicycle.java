package Inheritance.teste;

public class Bicycle {

	public int gear;
	public int speed;
	
	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
//	the Bicycle class has three methods
	public void applyBrake(int decrement) {
		speed -= decrement;
		
	}
	
	public void speedUp(int increment) {
		speed += increment;
		
	}
	
	@Override
	public String toString() {
		return ("No of gears are " + gear + "\n" + "Speed of bicycle is " + speed);
		
	}
	
	
}
