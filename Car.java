package com.tnsday4;

public class Car 
{
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run()
	{
		if(doors.equals("closed") && engine.equals("on") && drivers.equals("seated") && speed >0)
		{
		return "car is running";
		}
		else
		{
			return"car is not running";
		}
	}
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setSpeed(10);
		c1.setDoors("closed");
		c1.setEngine("on");
		c1.setDrivers("seated");
		System.out.println(c1.run());
			
	}
}

