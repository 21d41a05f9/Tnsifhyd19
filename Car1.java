package com.tnsday4;

public class Car1 
{
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
public Car1()
{
	doors="closed";
	engine="on";
	drivers="seated";
	speed=30;	
}
public String run()
{
	if(doors.equals("opened") && engine.equals("on") && drivers.equals("seated") && speed >0)
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
	Car1 car=new Car1();
	System.out.println(car.run());
}
}


