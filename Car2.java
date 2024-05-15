package com.tnsday4;

public class Car2
{
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	
	public Car2(String doors,String engine,String drivers,int speed)
	{
		this.doors="closed";
		this.engine="on";
		this.drivers="seated";
		this.speed=40;
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
		Car2 c2=new Car2("closed","on","seated",40);
		Car2 c=new Car2("closed","on","seated",40);
		System.out.println(c2.run());	
		System.out.println(c.run());
	}
}

