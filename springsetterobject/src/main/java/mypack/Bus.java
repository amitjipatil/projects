package mypack;

public class Bus implements Vehicle {

	private String fueltype;
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	private int speed;
	public void move() {
		System.out.println("Fuel type :" +fueltype);
		System.out.println("max speed :" +speed);
		System.out.println("bus is  started....");
		
	}
	
}
