package mypack;

public class Car implements Vehicle{
	private String fueltype;
	private String highspeed;
	
	
	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}


	public String getHighspeed() {
		return highspeed;
	}


	public void setHighspeed(String highspeed) {
		this.highspeed = highspeed;
	}


	public void move()
	{
		System.out.println("Fuel type :" +fueltype);
		System.out.println("max highspeed :" +highspeed);
		System.out.println("car started....");
	}

}
